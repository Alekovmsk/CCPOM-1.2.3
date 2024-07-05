
package org.openmetadata.schema.entity.data;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.schema.EntityInterface;
import org.openmetadata.schema.api.data.DocumentReference;
import org.openmetadata.schema.entity.type.Style;
import org.openmetadata.schema.type.ChangeDescription;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.ProviderType;
import org.openmetadata.schema.type.TagLabel;
import org.openmetadata.schema.type.Votes;


/**
 * KnowledgeCenterDocument
 * <p>
 * This schema defines te Knowledge center document entities.@om-entity-type
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "displayName",
    "description",
    "agreementType",
    "agreementOperator",
    "agreementContact",
    "agreementValidity",
    "style",
    "fullyQualifiedName",
    "synonyms",
    "knowledgeCenter",
    "parent",
    "children",
    "relatedDocuments",
    "references",
    "version",
    "updatedAt",
    "updatedBy",
    "href",
    "reviewers",
    "owner",
    "usageCount",
    "tags",
    "changeDescription",
    "status",
    "deleted",
    "provider",
    "disabled",
    "mutuallyExclusive",
    "extension",
    "domain",
    "votes"
})
@Generated("jsonschema2pojo")
public class KnowledgeCenterDocument implements EntityInterface
{

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    @NotNull
    private UUID id;
    /**
     * Name that identifies an entity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name that identifies an entity.")
    @Pattern(regexp = "^(?U)[\\w'\\- .&()%]+$")
    @Size(min = 1, max = 128)
    @NotNull
    private String name;
    /**
     * Display Name that identifies this glossary.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this glossary.")
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
     * Agreement's type
     * 
     */
    @JsonProperty("agreementType")
    @JsonPropertyDescription("Agreement's type")
    private String agreementType;
    /**
     * Agreement's operator.
     * 
     */
    @JsonProperty("agreementOperator")
    @JsonPropertyDescription("Agreement's operator.")
    private String agreementOperator;
    /**
     * Agreement contact
     * 
     */
    @JsonProperty("agreementContact")
    @JsonPropertyDescription("Agreement contact")
    private String agreementContact;
    /**
     * Agreement validity
     * 
     */
    @JsonProperty("agreementValidity")
    @JsonPropertyDescription("Agreement validity")
    private String agreementValidity;
    /**
     * UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.
     * 
     */
    @JsonProperty("style")
    @JsonPropertyDescription("UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.")
    @Valid
    private Style style;
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String fullyQualifiedName;
    /**
     * Alternate names that are synonyms or near-synonyms for the knowledge center document.
     * 
     */
    @JsonProperty("synonyms")
    @JsonPropertyDescription("Alternate names that are synonyms or near-synonyms for the knowledge center document.")
    @Valid
    private List<String> synonyms = new ArrayList<String>();
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("knowledgeCenter")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    @NotNull
    private EntityReference knowledgeCenter;
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
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("relatedDocuments")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> relatedDocuments = null;
    /**
     * Link to a reference from an external glossary.
     * 
     */
    @JsonProperty("references")
    @JsonPropertyDescription("Link to a reference from an external glossary.")
    @Valid
    private List<DocumentReference> references = new ArrayList<DocumentReference>();
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
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("reviewers")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> reviewers = null;
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
     * Count of how many times this and it's children knowledge center documents are used as labels.
     * 
     */
    @JsonProperty("usageCount")
    @JsonPropertyDescription("Count of how many times this and it's children knowledge center documents are used as labels.")
    private Integer usageCount;
    /**
     * Tags associated with this knowledge center document. These tags captures relationship of a knowledge center document with a tag automatically. As an example a knowledge center document 'User.PhoneNumber' might have an associated tag 'PII.Sensitive'. When 'User.Address' is used to label a column in a table, 'PII.Sensitive' label is also applied automatically due to Associated tag relationship.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags associated with this knowledge center document. These tags captures relationship of a knowledge center document with a tag automatically. As an example a knowledge center document 'User.PhoneNumber' might have an associated tag 'PII.Sensitive'. When 'User.Address' is used to label a column in a table, 'PII.Sensitive' label is also applied automatically due to Associated tag relationship.")
    @Valid
    private List<TagLabel> tags = null;
    /**
     * Description of the change.
     * 
     */
    @JsonProperty("changeDescription")
    @JsonPropertyDescription("Description of the change.")
    @Valid
    private ChangeDescription changeDescription;
    @JsonProperty("status")
    private KnowledgeCenterDocument.Status status;
    /**
     * When `true` indicates the entity has been soft deleted.
     * 
     */
    @JsonProperty("deleted")
    @JsonPropertyDescription("When `true` indicates the entity has been soft deleted.")
    private Boolean deleted = false;
    /**
     * Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.
     * 
     */
    @JsonProperty("provider")
    @JsonPropertyDescription("Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.")
    private ProviderType provider = ProviderType.fromValue("user");
    /**
     * System glossary can't be deleted. Use this flag to disable them.
     * 
     */
    @JsonProperty("disabled")
    @JsonPropertyDescription("System glossary can't be deleted. Use this flag to disable them.")
    private Boolean disabled;
    /**
     * Knowledge center documents that are children of this document are mutually exclusive. When mutually exclusive is `true` only one document can be used to label an entity from this group. When mutually exclusive is `false`, multiple documents from this group can be used to label an entity.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    @JsonPropertyDescription("Knowledge center documents that are children of this document are mutually exclusive. When mutually exclusive is `true` only one document can be used to label an entity from this group. When mutually exclusive is `false`, multiple documents from this group can be used to label an entity.")
    private Boolean mutuallyExclusive = false;
    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    @JsonPropertyDescription("Entity extension data with custom attributes added to the entity.")
    private Object extension;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference domain;
    /**
     * Votes
     * <p>
     * This schema defines the Votes for a Data Asset.
     * 
     */
    @JsonProperty("votes")
    @JsonPropertyDescription("This schema defines the Votes for a Data Asset.")
    @Valid
    private Votes votes;

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    public KnowledgeCenterDocument withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Name that identifies an entity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name that identifies an entity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public KnowledgeCenterDocument withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this glossary.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this glossary.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public KnowledgeCenterDocument withDisplayName(String displayName) {
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

    public KnowledgeCenterDocument withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Agreement's type
     * 
     */
    @JsonProperty("agreementType")
    public String getAgreementType() {
        return agreementType;
    }

    /**
     * Agreement's type
     * 
     */
    @JsonProperty("agreementType")
    public void setAgreementType(String agreementType) {
        this.agreementType = agreementType;
    }

    public KnowledgeCenterDocument withAgreementType(String agreementType) {
        this.agreementType = agreementType;
        return this;
    }

    /**
     * Agreement's operator.
     * 
     */
    @JsonProperty("agreementOperator")
    public String getAgreementOperator() {
        return agreementOperator;
    }

    /**
     * Agreement's operator.
     * 
     */
    @JsonProperty("agreementOperator")
    public void setAgreementOperator(String agreementOperator) {
        this.agreementOperator = agreementOperator;
    }

    public KnowledgeCenterDocument withAgreementOperator(String agreementOperator) {
        this.agreementOperator = agreementOperator;
        return this;
    }

    /**
     * Agreement contact
     * 
     */
    @JsonProperty("agreementContact")
    public String getAgreementContact() {
        return agreementContact;
    }

    /**
     * Agreement contact
     * 
     */
    @JsonProperty("agreementContact")
    public void setAgreementContact(String agreementContact) {
        this.agreementContact = agreementContact;
    }

    public KnowledgeCenterDocument withAgreementContact(String agreementContact) {
        this.agreementContact = agreementContact;
        return this;
    }

    /**
     * Agreement validity
     * 
     */
    @JsonProperty("agreementValidity")
    public String getAgreementValidity() {
        return agreementValidity;
    }

    /**
     * Agreement validity
     * 
     */
    @JsonProperty("agreementValidity")
    public void setAgreementValidity(String agreementValidity) {
        this.agreementValidity = agreementValidity;
    }

    public KnowledgeCenterDocument withAgreementValidity(String agreementValidity) {
        this.agreementValidity = agreementValidity;
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

    public KnowledgeCenterDocument withStyle(Style style) {
        this.style = style;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    public KnowledgeCenterDocument withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
        return this;
    }

    /**
     * Alternate names that are synonyms or near-synonyms for the knowledge center document.
     * 
     */
    @JsonProperty("synonyms")
    public List<String> getSynonyms() {
        return synonyms;
    }

    /**
     * Alternate names that are synonyms or near-synonyms for the knowledge center document.
     * 
     */
    @JsonProperty("synonyms")
    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    public KnowledgeCenterDocument withSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("knowledgeCenter")
    public EntityReference getKnowledgeCenter() {
        return knowledgeCenter;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("knowledgeCenter")
    public void setKnowledgeCenter(EntityReference knowledgeCenter) {
        this.knowledgeCenter = knowledgeCenter;
    }

    public KnowledgeCenterDocument withKnowledgeCenter(EntityReference knowledgeCenter) {
        this.knowledgeCenter = knowledgeCenter;
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

    public KnowledgeCenterDocument withParent(EntityReference parent) {
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

    public KnowledgeCenterDocument withChildren(List<EntityReference> children) {
        this.children = children;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("relatedDocuments")
    public List<EntityReference> getRelatedDocuments() {
        return relatedDocuments;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("relatedDocuments")
    public void setRelatedDocuments(List<EntityReference> relatedDocuments) {
        this.relatedDocuments = relatedDocuments;
    }

    public KnowledgeCenterDocument withRelatedDocuments(List<EntityReference> relatedDocuments) {
        this.relatedDocuments = relatedDocuments;
        return this;
    }

    /**
     * Link to a reference from an external glossary.
     * 
     */
    @JsonProperty("references")
    public List<DocumentReference> getReferences() {
        return references;
    }

    /**
     * Link to a reference from an external glossary.
     * 
     */
    @JsonProperty("references")
    public void setReferences(List<DocumentReference> references) {
        this.references = references;
    }

    public KnowledgeCenterDocument withReferences(List<DocumentReference> references) {
        this.references = references;
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

    public KnowledgeCenterDocument withVersion(Double version) {
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

    public KnowledgeCenterDocument withUpdatedAt(Long updatedAt) {
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

    public KnowledgeCenterDocument withUpdatedBy(String updatedBy) {
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

    public KnowledgeCenterDocument withHref(URI href) {
        this.href = href;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("reviewers")
    public List<EntityReference> getReviewers() {
        return reviewers;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("reviewers")
    public void setReviewers(List<EntityReference> reviewers) {
        this.reviewers = reviewers;
    }

    public KnowledgeCenterDocument withReviewers(List<EntityReference> reviewers) {
        this.reviewers = reviewers;
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

    public KnowledgeCenterDocument withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Count of how many times this and it's children knowledge center documents are used as labels.
     * 
     */
    @JsonProperty("usageCount")
    public Integer getUsageCount() {
        return usageCount;
    }

    /**
     * Count of how many times this and it's children knowledge center documents are used as labels.
     * 
     */
    @JsonProperty("usageCount")
    public void setUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
    }

    public KnowledgeCenterDocument withUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
        return this;
    }

    /**
     * Tags associated with this knowledge center document. These tags captures relationship of a knowledge center document with a tag automatically. As an example a knowledge center document 'User.PhoneNumber' might have an associated tag 'PII.Sensitive'. When 'User.Address' is used to label a column in a table, 'PII.Sensitive' label is also applied automatically due to Associated tag relationship.
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags associated with this knowledge center document. These tags captures relationship of a knowledge center document with a tag automatically. As an example a knowledge center document 'User.PhoneNumber' might have an associated tag 'PII.Sensitive'. When 'User.Address' is used to label a column in a table, 'PII.Sensitive' label is also applied automatically due to Associated tag relationship.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public KnowledgeCenterDocument withTags(List<TagLabel> tags) {
        this.tags = tags;
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

    public KnowledgeCenterDocument withChangeDescription(ChangeDescription changeDescription) {
        this.changeDescription = changeDescription;
        return this;
    }

    @JsonProperty("status")
    public KnowledgeCenterDocument.Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(KnowledgeCenterDocument.Status status) {
        this.status = status;
    }

    public KnowledgeCenterDocument withStatus(KnowledgeCenterDocument.Status status) {
        this.status = status;
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

    public KnowledgeCenterDocument withDeleted(Boolean deleted) {
        this.deleted = deleted;
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

    public KnowledgeCenterDocument withProvider(ProviderType provider) {
        this.provider = provider;
        return this;
    }

    /**
     * System glossary can't be deleted. Use this flag to disable them.
     * 
     */
    @JsonProperty("disabled")
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * System glossary can't be deleted. Use this flag to disable them.
     * 
     */
    @JsonProperty("disabled")
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public KnowledgeCenterDocument withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * Knowledge center documents that are children of this document are mutually exclusive. When mutually exclusive is `true` only one document can be used to label an entity from this group. When mutually exclusive is `false`, multiple documents from this group can be used to label an entity.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public Boolean getMutuallyExclusive() {
        return mutuallyExclusive;
    }

    /**
     * Knowledge center documents that are children of this document are mutually exclusive. When mutually exclusive is `true` only one document can be used to label an entity from this group. When mutually exclusive is `false`, multiple documents from this group can be used to label an entity.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public void setMutuallyExclusive(Boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
    }

    public KnowledgeCenterDocument withMutuallyExclusive(Boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
        return this;
    }

    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    public Object getExtension() {
        return extension;
    }

    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    public void setExtension(Object extension) {
        this.extension = extension;
    }

    public KnowledgeCenterDocument withExtension(Object extension) {
        this.extension = extension;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("domain")
    public EntityReference getDomain() {
        return domain;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(EntityReference domain) {
        this.domain = domain;
    }

    public KnowledgeCenterDocument withDomain(EntityReference domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Votes
     * <p>
     * This schema defines the Votes for a Data Asset.
     * 
     */
    @JsonProperty("votes")
    public Votes getVotes() {
        return votes;
    }

    /**
     * Votes
     * <p>
     * This schema defines the Votes for a Data Asset.
     * 
     */
    @JsonProperty("votes")
    public void setVotes(Votes votes) {
        this.votes = votes;
    }

    public KnowledgeCenterDocument withVotes(Votes votes) {
        this.votes = votes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KnowledgeCenterDocument.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("agreementType");
        sb.append('=');
        sb.append(((this.agreementType == null)?"<null>":this.agreementType));
        sb.append(',');
        sb.append("agreementOperator");
        sb.append('=');
        sb.append(((this.agreementOperator == null)?"<null>":this.agreementOperator));
        sb.append(',');
        sb.append("agreementContact");
        sb.append('=');
        sb.append(((this.agreementContact == null)?"<null>":this.agreementContact));
        sb.append(',');
        sb.append("agreementValidity");
        sb.append('=');
        sb.append(((this.agreementValidity == null)?"<null>":this.agreementValidity));
        sb.append(',');
        sb.append("style");
        sb.append('=');
        sb.append(((this.style == null)?"<null>":this.style));
        sb.append(',');
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
        sb.append(',');
        sb.append("synonyms");
        sb.append('=');
        sb.append(((this.synonyms == null)?"<null>":this.synonyms));
        sb.append(',');
        sb.append("knowledgeCenter");
        sb.append('=');
        sb.append(((this.knowledgeCenter == null)?"<null>":this.knowledgeCenter));
        sb.append(',');
        sb.append("parent");
        sb.append('=');
        sb.append(((this.parent == null)?"<null>":this.parent));
        sb.append(',');
        sb.append("children");
        sb.append('=');
        sb.append(((this.children == null)?"<null>":this.children));
        sb.append(',');
        sb.append("relatedDocuments");
        sb.append('=');
        sb.append(((this.relatedDocuments == null)?"<null>":this.relatedDocuments));
        sb.append(',');
        sb.append("references");
        sb.append('=');
        sb.append(((this.references == null)?"<null>":this.references));
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
        sb.append("reviewers");
        sb.append('=');
        sb.append(((this.reviewers == null)?"<null>":this.reviewers));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("usageCount");
        sb.append('=');
        sb.append(((this.usageCount == null)?"<null>":this.usageCount));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("changeDescription");
        sb.append('=');
        sb.append(((this.changeDescription == null)?"<null>":this.changeDescription));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("deleted");
        sb.append('=');
        sb.append(((this.deleted == null)?"<null>":this.deleted));
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
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("domain");
        sb.append('=');
        sb.append(((this.domain == null)?"<null>":this.domain));
        sb.append(',');
        sb.append("votes");
        sb.append('=');
        sb.append(((this.votes == null)?"<null>":this.votes));
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
        result = ((result* 31)+((this.agreementType == null)? 0 :this.agreementType.hashCode()));
        result = ((result* 31)+((this.parent == null)? 0 :this.parent.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.references == null)? 0 :this.references.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.children == null)? 0 :this.children.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.relatedDocuments == null)? 0 :this.relatedDocuments.hashCode()));
        result = ((result* 31)+((this.disabled == null)? 0 :this.disabled.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.agreementValidity == null)? 0 :this.agreementValidity.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.changeDescription == null)? 0 :this.changeDescription.hashCode()));
        result = ((result* 31)+((this.agreementOperator == null)? 0 :this.agreementOperator.hashCode()));
        result = ((result* 31)+((this.synonyms == null)? 0 :this.synonyms.hashCode()));
        result = ((result* 31)+((this.agreementContact == null)? 0 :this.agreementContact.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.reviewers == null)? 0 :this.reviewers.hashCode()));
        result = ((result* 31)+((this.usageCount == null)? 0 :this.usageCount.hashCode()));
        result = ((result* 31)+((this.knowledgeCenter == null)? 0 :this.knowledgeCenter.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.deleted == null)? 0 :this.deleted.hashCode()));
        result = ((result* 31)+((this.mutuallyExclusive == null)? 0 :this.mutuallyExclusive.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.style == null)? 0 :this.style.hashCode()));
        result = ((result* 31)+((this.votes == null)? 0 :this.votes.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KnowledgeCenterDocument) == false) {
            return false;
        }
        KnowledgeCenterDocument rhs = ((KnowledgeCenterDocument) other);
        return ((((((((((((((((((((((((((((((((((this.agreementType == rhs.agreementType)||((this.agreementType!= null)&&this.agreementType.equals(rhs.agreementType)))&&((this.parent == rhs.parent)||((this.parent!= null)&&this.parent.equals(rhs.parent))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.references == rhs.references)||((this.references!= null)&&this.references.equals(rhs.references))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.children == rhs.children)||((this.children!= null)&&this.children.equals(rhs.children))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.relatedDocuments == rhs.relatedDocuments)||((this.relatedDocuments!= null)&&this.relatedDocuments.equals(rhs.relatedDocuments))))&&((this.disabled == rhs.disabled)||((this.disabled!= null)&&this.disabled.equals(rhs.disabled))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.agreementValidity == rhs.agreementValidity)||((this.agreementValidity!= null)&&this.agreementValidity.equals(rhs.agreementValidity))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.changeDescription == rhs.changeDescription)||((this.changeDescription!= null)&&this.changeDescription.equals(rhs.changeDescription))))&&((this.agreementOperator == rhs.agreementOperator)||((this.agreementOperator!= null)&&this.agreementOperator.equals(rhs.agreementOperator))))&&((this.synonyms == rhs.synonyms)||((this.synonyms!= null)&&this.synonyms.equals(rhs.synonyms))))&&((this.agreementContact == rhs.agreementContact)||((this.agreementContact!= null)&&this.agreementContact.equals(rhs.agreementContact))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.reviewers == rhs.reviewers)||((this.reviewers!= null)&&this.reviewers.equals(rhs.reviewers))))&&((this.usageCount == rhs.usageCount)||((this.usageCount!= null)&&this.usageCount.equals(rhs.usageCount))))&&((this.knowledgeCenter == rhs.knowledgeCenter)||((this.knowledgeCenter!= null)&&this.knowledgeCenter.equals(rhs.knowledgeCenter))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.deleted == rhs.deleted)||((this.deleted!= null)&&this.deleted.equals(rhs.deleted))))&&((this.mutuallyExclusive == rhs.mutuallyExclusive)||((this.mutuallyExclusive!= null)&&this.mutuallyExclusive.equals(rhs.mutuallyExclusive))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.style == rhs.style)||((this.style!= null)&&this.style.equals(rhs.style))))&&((this.votes == rhs.votes)||((this.votes!= null)&&this.votes.equals(rhs.votes))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

    @Generated("jsonschema2pojo")
    public enum Status {

        DRAFT("Draft"),
        APPROVED("Approved"),
        DEPRECATED("Deprecated"),
        REJECTED("Rejected");
        private final String value;
        private final static Map<String, KnowledgeCenterDocument.Status> CONSTANTS = new HashMap<String, KnowledgeCenterDocument.Status>();

        static {
            for (KnowledgeCenterDocument.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static KnowledgeCenterDocument.Status fromValue(String value) {
            KnowledgeCenterDocument.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
