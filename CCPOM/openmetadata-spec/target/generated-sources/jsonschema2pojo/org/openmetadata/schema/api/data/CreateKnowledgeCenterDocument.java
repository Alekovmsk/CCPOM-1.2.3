
package org.openmetadata.schema.api.data;

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
import org.openmetadata.schema.type.TagLabel;


/**
 * CreateKnowledgeCenterDocumentRequest
 * <p>
 * Create Knowledge Center Document entity request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "knowledgeCenter",
    "parent",
    "name",
    "displayName",
    "description",
    "agreementType",
    "agreementOperator",
    "agreementContact",
    "agreementValidity",
    "style",
    "synonyms",
    "relatedDocuments",
    "references",
    "reviewers",
    "owner",
    "tags",
    "provider",
    "mutuallyExclusive",
    "extension"
})
@Generated("jsonschema2pojo")
public class CreateKnowledgeCenterDocument implements CreateEntity
{

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("knowledgeCenter")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    @NotNull
    private String knowledgeCenter;
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("parent")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String parent;
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
     * Display Name that identifies this knowledge center document.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this knowledge center document.")
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
     * Alternate names that are synonyms or near-synonyms for the knowledge center document.
     * 
     */
    @JsonProperty("synonyms")
    @JsonPropertyDescription("Alternate names that are synonyms or near-synonyms for the knowledge center document.")
    @Valid
    private List<String> synonyms = new ArrayList<String>();
    /**
     * Other array of knowledge center document fully qualified names that are related to this knowledge center document.
     * 
     */
    @JsonProperty("relatedDocuments")
    @JsonPropertyDescription("Other array of knowledge center document fully qualified names that are related to this knowledge center document.")
    @Valid
    private List<String> relatedDocuments = new ArrayList<String>();
    /**
     * Link to a reference from an external Knowledge Center.
     * 
     */
    @JsonProperty("references")
    @JsonPropertyDescription("Link to a reference from an external Knowledge Center.")
    @Valid
    private List<DocumentReference> references = new ArrayList<DocumentReference>();
    /**
     * User names of the reviewers for this Knowledge Center.
     * 
     */
    @JsonProperty("reviewers")
    @JsonPropertyDescription("User names of the reviewers for this Knowledge Center.")
    @Valid
    private List<String> reviewers = new ArrayList<String>();
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
     * Tags for this knowledge center document.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this knowledge center document.")
    @Valid
    private List<TagLabel> tags = null;
    /**
     * Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.
     * 
     */
    @JsonProperty("provider")
    @JsonPropertyDescription("Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.")
    private ProviderType provider = ProviderType.fromValue("user");
    /**
     * Knowledge Center Documents that are children of this document are mutually exclusive. When mutually exclusive is `true` only one document can be used to label an entity from this group. When mutually exclusive is `false`, multiple documents from this group can be used to label an entity.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    @JsonPropertyDescription("Knowledge Center Documents that are children of this document are mutually exclusive. When mutually exclusive is `true` only one document can be used to label an entity from this group. When mutually exclusive is `false`, multiple documents from this group can be used to label an entity.")
    private Boolean mutuallyExclusive = false;
    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    @JsonPropertyDescription("Entity extension data with custom attributes added to the entity.")
    private Object extension;

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("knowledgeCenter")
    public String getKnowledgeCenter() {
        return knowledgeCenter;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("knowledgeCenter")
    public void setKnowledgeCenter(String knowledgeCenter) {
        this.knowledgeCenter = knowledgeCenter;
    }

    public CreateKnowledgeCenterDocument withKnowledgeCenter(String knowledgeCenter) {
        this.knowledgeCenter = knowledgeCenter;
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

    public CreateKnowledgeCenterDocument withParent(String parent) {
        this.parent = parent;
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

    public CreateKnowledgeCenterDocument withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this knowledge center document.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this knowledge center document.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateKnowledgeCenterDocument withDisplayName(String displayName) {
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

    public CreateKnowledgeCenterDocument withDescription(String description) {
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

    public CreateKnowledgeCenterDocument withAgreementType(String agreementType) {
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

    public CreateKnowledgeCenterDocument withAgreementOperator(String agreementOperator) {
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

    public CreateKnowledgeCenterDocument withAgreementContact(String agreementContact) {
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

    public CreateKnowledgeCenterDocument withAgreementValidity(String agreementValidity) {
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

    public CreateKnowledgeCenterDocument withStyle(Style style) {
        this.style = style;
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

    public CreateKnowledgeCenterDocument withSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
        return this;
    }

    /**
     * Other array of knowledge center document fully qualified names that are related to this knowledge center document.
     * 
     */
    @JsonProperty("relatedDocuments")
    public List<String> getRelatedDocuments() {
        return relatedDocuments;
    }

    /**
     * Other array of knowledge center document fully qualified names that are related to this knowledge center document.
     * 
     */
    @JsonProperty("relatedDocuments")
    public void setRelatedDocuments(List<String> relatedDocuments) {
        this.relatedDocuments = relatedDocuments;
    }

    public CreateKnowledgeCenterDocument withRelatedDocuments(List<String> relatedDocuments) {
        this.relatedDocuments = relatedDocuments;
        return this;
    }

    /**
     * Link to a reference from an external Knowledge Center.
     * 
     */
    @JsonProperty("references")
    public List<DocumentReference> getReferences() {
        return references;
    }

    /**
     * Link to a reference from an external Knowledge Center.
     * 
     */
    @JsonProperty("references")
    public void setReferences(List<DocumentReference> references) {
        this.references = references;
    }

    public CreateKnowledgeCenterDocument withReferences(List<DocumentReference> references) {
        this.references = references;
        return this;
    }

    /**
     * User names of the reviewers for this Knowledge Center.
     * 
     */
    @JsonProperty("reviewers")
    public List<String> getReviewers() {
        return reviewers;
    }

    /**
     * User names of the reviewers for this Knowledge Center.
     * 
     */
    @JsonProperty("reviewers")
    public void setReviewers(List<String> reviewers) {
        this.reviewers = reviewers;
    }

    public CreateKnowledgeCenterDocument withReviewers(List<String> reviewers) {
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

    public CreateKnowledgeCenterDocument withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Tags for this knowledge center document.
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this knowledge center document.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public CreateKnowledgeCenterDocument withTags(List<TagLabel> tags) {
        this.tags = tags;
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

    public CreateKnowledgeCenterDocument withProvider(ProviderType provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Knowledge Center Documents that are children of this document are mutually exclusive. When mutually exclusive is `true` only one document can be used to label an entity from this group. When mutually exclusive is `false`, multiple documents from this group can be used to label an entity.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public Boolean getMutuallyExclusive() {
        return mutuallyExclusive;
    }

    /**
     * Knowledge Center Documents that are children of this document are mutually exclusive. When mutually exclusive is `true` only one document can be used to label an entity from this group. When mutually exclusive is `false`, multiple documents from this group can be used to label an entity.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public void setMutuallyExclusive(Boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
    }

    public CreateKnowledgeCenterDocument withMutuallyExclusive(Boolean mutuallyExclusive) {
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

    public CreateKnowledgeCenterDocument withExtension(Object extension) {
        this.extension = extension;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateKnowledgeCenterDocument.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("knowledgeCenter");
        sb.append('=');
        sb.append(((this.knowledgeCenter == null)?"<null>":this.knowledgeCenter));
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
        sb.append("synonyms");
        sb.append('=');
        sb.append(((this.synonyms == null)?"<null>":this.synonyms));
        sb.append(',');
        sb.append("relatedDocuments");
        sb.append('=');
        sb.append(((this.relatedDocuments == null)?"<null>":this.relatedDocuments));
        sb.append(',');
        sb.append("references");
        sb.append('=');
        sb.append(((this.references == null)?"<null>":this.references));
        sb.append(',');
        sb.append("reviewers");
        sb.append('=');
        sb.append(((this.reviewers == null)?"<null>":this.reviewers));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("provider");
        sb.append('=');
        sb.append(((this.provider == null)?"<null>":this.provider));
        sb.append(',');
        sb.append("mutuallyExclusive");
        sb.append('=');
        sb.append(((this.mutuallyExclusive == null)?"<null>":this.mutuallyExclusive));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
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
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.parent == null)? 0 :this.parent.hashCode()));
        result = ((result* 31)+((this.agreementType == null)? 0 :this.agreementType.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.references == null)? 0 :this.references.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.agreementOperator == null)? 0 :this.agreementOperator.hashCode()));
        result = ((result* 31)+((this.synonyms == null)? 0 :this.synonyms.hashCode()));
        result = ((result* 31)+((this.agreementContact == null)? 0 :this.agreementContact.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.reviewers == null)? 0 :this.reviewers.hashCode()));
        result = ((result* 31)+((this.knowledgeCenter == null)? 0 :this.knowledgeCenter.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.mutuallyExclusive == null)? 0 :this.mutuallyExclusive.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.relatedDocuments == null)? 0 :this.relatedDocuments.hashCode()));
        result = ((result* 31)+((this.style == null)? 0 :this.style.hashCode()));
        result = ((result* 31)+((this.agreementValidity == null)? 0 :this.agreementValidity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateKnowledgeCenterDocument) == false) {
            return false;
        }
        CreateKnowledgeCenterDocument rhs = ((CreateKnowledgeCenterDocument) other);
        return ((((((((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.parent == rhs.parent)||((this.parent!= null)&&this.parent.equals(rhs.parent))))&&((this.agreementType == rhs.agreementType)||((this.agreementType!= null)&&this.agreementType.equals(rhs.agreementType))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.references == rhs.references)||((this.references!= null)&&this.references.equals(rhs.references))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.agreementOperator == rhs.agreementOperator)||((this.agreementOperator!= null)&&this.agreementOperator.equals(rhs.agreementOperator))))&&((this.synonyms == rhs.synonyms)||((this.synonyms!= null)&&this.synonyms.equals(rhs.synonyms))))&&((this.agreementContact == rhs.agreementContact)||((this.agreementContact!= null)&&this.agreementContact.equals(rhs.agreementContact))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.reviewers == rhs.reviewers)||((this.reviewers!= null)&&this.reviewers.equals(rhs.reviewers))))&&((this.knowledgeCenter == rhs.knowledgeCenter)||((this.knowledgeCenter!= null)&&this.knowledgeCenter.equals(rhs.knowledgeCenter))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.mutuallyExclusive == rhs.mutuallyExclusive)||((this.mutuallyExclusive!= null)&&this.mutuallyExclusive.equals(rhs.mutuallyExclusive))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.relatedDocuments == rhs.relatedDocuments)||((this.relatedDocuments!= null)&&this.relatedDocuments.equals(rhs.relatedDocuments))))&&((this.style == rhs.style)||((this.style!= null)&&this.style.equals(rhs.style))))&&((this.agreementValidity == rhs.agreementValidity)||((this.agreementValidity!= null)&&this.agreementValidity.equals(rhs.agreementValidity))));
    }

}
