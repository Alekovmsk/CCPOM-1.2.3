
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
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.ProviderType;
import org.openmetadata.schema.type.TagLabel;


/**
 * CreateGlossaryRequest
 * <p>
 * Create Glossary entity request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "reviewers",
    "owner",
    "tags",
    "provider",
    "mutuallyExclusive",
    "domain",
    "extension"
})
@Generated("jsonschema2pojo")
public class CreateGlossary implements CreateEntity
{

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
     * User references of the reviewers for this glossary.
     * 
     */
    @JsonProperty("reviewers")
    @JsonPropertyDescription("User references of the reviewers for this glossary.")
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
     * Tags for this glossary
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this glossary")
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
     * Glossary terms that are direct children in this glossary are mutually exclusive. When mutually exclusive is `true` only one term can be used to label an entity. When mutually exclusive is `false`, multiple terms from this group can be used to label an entity.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    @JsonPropertyDescription("Glossary terms that are direct children in this glossary are mutually exclusive. When mutually exclusive is `true` only one term can be used to label an entity. When mutually exclusive is `false`, multiple terms from this group can be used to label an entity.")
    private Boolean mutuallyExclusive = false;
    /**
     * Fully qualified name of the domain the Glossary belongs to.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("Fully qualified name of the domain the Glossary belongs to.")
    private String domain;
    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    @JsonPropertyDescription("Entity extension data with custom attributes added to the entity.")
    private Object extension;

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

    public CreateGlossary withName(String name) {
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

    public CreateGlossary withDisplayName(String displayName) {
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

    public CreateGlossary withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * User references of the reviewers for this glossary.
     * 
     */
    @JsonProperty("reviewers")
    public List<String> getReviewers() {
        return reviewers;
    }

    /**
     * User references of the reviewers for this glossary.
     * 
     */
    @JsonProperty("reviewers")
    public void setReviewers(List<String> reviewers) {
        this.reviewers = reviewers;
    }

    public CreateGlossary withReviewers(List<String> reviewers) {
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

    public CreateGlossary withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Tags for this glossary
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this glossary
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public CreateGlossary withTags(List<TagLabel> tags) {
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

    public CreateGlossary withProvider(ProviderType provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Glossary terms that are direct children in this glossary are mutually exclusive. When mutually exclusive is `true` only one term can be used to label an entity. When mutually exclusive is `false`, multiple terms from this group can be used to label an entity.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public Boolean getMutuallyExclusive() {
        return mutuallyExclusive;
    }

    /**
     * Glossary terms that are direct children in this glossary are mutually exclusive. When mutually exclusive is `true` only one term can be used to label an entity. When mutually exclusive is `false`, multiple terms from this group can be used to label an entity.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public void setMutuallyExclusive(Boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
    }

    public CreateGlossary withMutuallyExclusive(Boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
        return this;
    }

    /**
     * Fully qualified name of the domain the Glossary belongs to.
     * 
     */
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    /**
     * Fully qualified name of the domain the Glossary belongs to.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CreateGlossary withDomain(String domain) {
        this.domain = domain;
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

    public CreateGlossary withExtension(Object extension) {
        this.extension = extension;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateGlossary.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("domain");
        sb.append('=');
        sb.append(((this.domain == null)?"<null>":this.domain));
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
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.mutuallyExclusive == null)? 0 :this.mutuallyExclusive.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.reviewers == null)? 0 :this.reviewers.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateGlossary) == false) {
            return false;
        }
        CreateGlossary rhs = ((CreateGlossary) other);
        return (((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.mutuallyExclusive == rhs.mutuallyExclusive)||((this.mutuallyExclusive!= null)&&this.mutuallyExclusive.equals(rhs.mutuallyExclusive))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.reviewers == rhs.reviewers)||((this.reviewers!= null)&&this.reviewers.equals(rhs.reviewers))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }

}
