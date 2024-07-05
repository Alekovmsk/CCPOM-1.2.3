
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
 * CreateGlossaryTermRequest
 * <p>
 * Create Glossary term entity request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "glossary",
    "parent",
    "name",
    "displayName",
    "description",
    "style",
    "synonyms",
    "relatedTerms",
    "references",
    "reviewers",
    "owner",
    "tags",
    "provider",
    "mutuallyExclusive",
    "extension"
})
@Generated("jsonschema2pojo")
public class CreateGlossaryTerm implements CreateEntity
{

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("glossary")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    @NotNull
    private String glossary;
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
     * Display Name that identifies this glossary term.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this glossary term.")
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
     * UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.
     * 
     */
    @JsonProperty("style")
    @JsonPropertyDescription("UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.")
    @Valid
    private Style style;
    /**
     * Alternate names that are synonyms or near-synonyms for the glossary term.
     * 
     */
    @JsonProperty("synonyms")
    @JsonPropertyDescription("Alternate names that are synonyms or near-synonyms for the glossary term.")
    @Valid
    private List<String> synonyms = new ArrayList<String>();
    /**
     * Other array of glossary term fully qualified names that are related to this glossary term.
     * 
     */
    @JsonProperty("relatedTerms")
    @JsonPropertyDescription("Other array of glossary term fully qualified names that are related to this glossary term.")
    @Valid
    private List<String> relatedTerms = new ArrayList<String>();
    /**
     * Link to a reference from an external glossary.
     * 
     */
    @JsonProperty("references")
    @JsonPropertyDescription("Link to a reference from an external glossary.")
    @Valid
    private List<TermReference> references = new ArrayList<TermReference>();
    /**
     * User names of the reviewers for this glossary.
     * 
     */
    @JsonProperty("reviewers")
    @JsonPropertyDescription("User names of the reviewers for this glossary.")
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
     * Tags for this glossary term.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this glossary term.")
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
     * Glossary terms that are children of this term are mutually exclusive. When mutually exclusive is `true` only one term can be used to label an entity from this group. When mutually exclusive is `false`, multiple terms from this group can be used to label an entity.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    @JsonPropertyDescription("Glossary terms that are children of this term are mutually exclusive. When mutually exclusive is `true` only one term can be used to label an entity from this group. When mutually exclusive is `false`, multiple terms from this group can be used to label an entity.")
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
    @JsonProperty("glossary")
    public String getGlossary() {
        return glossary;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("glossary")
    public void setGlossary(String glossary) {
        this.glossary = glossary;
    }

    public CreateGlossaryTerm withGlossary(String glossary) {
        this.glossary = glossary;
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

    public CreateGlossaryTerm withParent(String parent) {
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

    public CreateGlossaryTerm withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this glossary term.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this glossary term.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateGlossaryTerm withDisplayName(String displayName) {
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

    public CreateGlossaryTerm withDescription(String description) {
        this.description = description;
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

    public CreateGlossaryTerm withStyle(Style style) {
        this.style = style;
        return this;
    }

    /**
     * Alternate names that are synonyms or near-synonyms for the glossary term.
     * 
     */
    @JsonProperty("synonyms")
    public List<String> getSynonyms() {
        return synonyms;
    }

    /**
     * Alternate names that are synonyms or near-synonyms for the glossary term.
     * 
     */
    @JsonProperty("synonyms")
    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    public CreateGlossaryTerm withSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
        return this;
    }

    /**
     * Other array of glossary term fully qualified names that are related to this glossary term.
     * 
     */
    @JsonProperty("relatedTerms")
    public List<String> getRelatedTerms() {
        return relatedTerms;
    }

    /**
     * Other array of glossary term fully qualified names that are related to this glossary term.
     * 
     */
    @JsonProperty("relatedTerms")
    public void setRelatedTerms(List<String> relatedTerms) {
        this.relatedTerms = relatedTerms;
    }

    public CreateGlossaryTerm withRelatedTerms(List<String> relatedTerms) {
        this.relatedTerms = relatedTerms;
        return this;
    }

    /**
     * Link to a reference from an external glossary.
     * 
     */
    @JsonProperty("references")
    public List<TermReference> getReferences() {
        return references;
    }

    /**
     * Link to a reference from an external glossary.
     * 
     */
    @JsonProperty("references")
    public void setReferences(List<TermReference> references) {
        this.references = references;
    }

    public CreateGlossaryTerm withReferences(List<TermReference> references) {
        this.references = references;
        return this;
    }

    /**
     * User names of the reviewers for this glossary.
     * 
     */
    @JsonProperty("reviewers")
    public List<String> getReviewers() {
        return reviewers;
    }

    /**
     * User names of the reviewers for this glossary.
     * 
     */
    @JsonProperty("reviewers")
    public void setReviewers(List<String> reviewers) {
        this.reviewers = reviewers;
    }

    public CreateGlossaryTerm withReviewers(List<String> reviewers) {
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

    public CreateGlossaryTerm withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Tags for this glossary term.
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this glossary term.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public CreateGlossaryTerm withTags(List<TagLabel> tags) {
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

    public CreateGlossaryTerm withProvider(ProviderType provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Glossary terms that are children of this term are mutually exclusive. When mutually exclusive is `true` only one term can be used to label an entity from this group. When mutually exclusive is `false`, multiple terms from this group can be used to label an entity.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public Boolean getMutuallyExclusive() {
        return mutuallyExclusive;
    }

    /**
     * Glossary terms that are children of this term are mutually exclusive. When mutually exclusive is `true` only one term can be used to label an entity from this group. When mutually exclusive is `false`, multiple terms from this group can be used to label an entity.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public void setMutuallyExclusive(Boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
    }

    public CreateGlossaryTerm withMutuallyExclusive(Boolean mutuallyExclusive) {
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

    public CreateGlossaryTerm withExtension(Object extension) {
        this.extension = extension;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateGlossaryTerm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("glossary");
        sb.append('=');
        sb.append(((this.glossary == null)?"<null>":this.glossary));
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
        sb.append("style");
        sb.append('=');
        sb.append(((this.style == null)?"<null>":this.style));
        sb.append(',');
        sb.append("synonyms");
        sb.append('=');
        sb.append(((this.synonyms == null)?"<null>":this.synonyms));
        sb.append(',');
        sb.append("relatedTerms");
        sb.append('=');
        sb.append(((this.relatedTerms == null)?"<null>":this.relatedTerms));
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
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.references == null)? 0 :this.references.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.synonyms == null)? 0 :this.synonyms.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.relatedTerms == null)? 0 :this.relatedTerms.hashCode()));
        result = ((result* 31)+((this.reviewers == null)? 0 :this.reviewers.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.glossary == null)? 0 :this.glossary.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.mutuallyExclusive == null)? 0 :this.mutuallyExclusive.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.style == null)? 0 :this.style.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateGlossaryTerm) == false) {
            return false;
        }
        CreateGlossaryTerm rhs = ((CreateGlossaryTerm) other);
        return ((((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.parent == rhs.parent)||((this.parent!= null)&&this.parent.equals(rhs.parent))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.references == rhs.references)||((this.references!= null)&&this.references.equals(rhs.references))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.synonyms == rhs.synonyms)||((this.synonyms!= null)&&this.synonyms.equals(rhs.synonyms))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.relatedTerms == rhs.relatedTerms)||((this.relatedTerms!= null)&&this.relatedTerms.equals(rhs.relatedTerms))))&&((this.reviewers == rhs.reviewers)||((this.reviewers!= null)&&this.reviewers.equals(rhs.reviewers))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.glossary == rhs.glossary)||((this.glossary!= null)&&this.glossary.equals(rhs.glossary))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.mutuallyExclusive == rhs.mutuallyExclusive)||((this.mutuallyExclusive!= null)&&this.mutuallyExclusive.equals(rhs.mutuallyExclusive))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.style == rhs.style)||((this.style!= null)&&this.style.equals(rhs.style))));
    }

}
