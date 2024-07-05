
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
 * CreateClientCenterClientRequest
 * <p>
 * Create Client Center client entity request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "clientCenter",
    "parent",
    "name",
    "displayName",
    "description",
    "fullName",
    "dateOfBirth",
    "inn",
    "snils",
    "style",
    "synonyms",
    "relatedClients",
    "references",
    "reviewers",
    "owner",
    "tags",
    "provider",
    "mutuallyExclusive",
    "extension"
})
@Generated("jsonschema2pojo")
public class CreateClientCenterClient implements CreateEntity
{

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("clientCenter")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    @NotNull
    private String clientCenter;
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
     * Display Name that identifies this Client Center client.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this Client Center client.")
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
     * Client's full name
     * 
     */
    @JsonProperty("fullName")
    @JsonPropertyDescription("Client's full name")
    private String fullName;
    /**
     * Client's date of birth.
     * 
     */
    @JsonProperty("dateOfBirth")
    @JsonPropertyDescription("Client's date of birth.")
    private String dateOfBirth;
    /**
     * client INN
     * 
     */
    @JsonProperty("inn")
    @JsonPropertyDescription("client INN")
    private String inn;
    /**
     * Client's SNILS
     * 
     */
    @JsonProperty("snils")
    @JsonPropertyDescription("Client's SNILS")
    private String snils;
    /**
     * UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.
     * 
     */
    @JsonProperty("style")
    @JsonPropertyDescription("UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.")
    @Valid
    private Style style;
    /**
     * Alternate names that are synonyms or near-synonyms for the Client Center client.
     * 
     */
    @JsonProperty("synonyms")
    @JsonPropertyDescription("Alternate names that are synonyms or near-synonyms for the Client Center client.")
    @Valid
    private List<String> synonyms = new ArrayList<String>();
    /**
     * Other array of Client Center client fully qualified names that are related to this Client Center client.
     * 
     */
    @JsonProperty("relatedClients")
    @JsonPropertyDescription("Other array of Client Center client fully qualified names that are related to this Client Center client.")
    @Valid
    private List<String> relatedClients = new ArrayList<String>();
    /**
     * Link to a reference from an external Client Center.
     * 
     */
    @JsonProperty("references")
    @JsonPropertyDescription("Link to a reference from an external Client Center.")
    @Valid
    private List<ClientReference> references = new ArrayList<ClientReference>();
    /**
     * User names of the reviewers for this Client Center.
     * 
     */
    @JsonProperty("reviewers")
    @JsonPropertyDescription("User names of the reviewers for this Client Center.")
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
     * Tags for this Client Center client.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this Client Center client.")
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
     * Client Center clients that are children of this client are mutually exclusive. When mutually exclusive is `true` only one client can be used to label an entity from this group. When mutually exclusive is `false`, multiple clients from this group can be used to label an entity.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    @JsonPropertyDescription("Client Center clients that are children of this client are mutually exclusive. When mutually exclusive is `true` only one client can be used to label an entity from this group. When mutually exclusive is `false`, multiple clients from this group can be used to label an entity.")
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
    @JsonProperty("clientCenter")
    public String getClientCenter() {
        return clientCenter;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("clientCenter")
    public void setClientCenter(String clientCenter) {
        this.clientCenter = clientCenter;
    }

    public CreateClientCenterClient withClientCenter(String clientCenter) {
        this.clientCenter = clientCenter;
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

    public CreateClientCenterClient withParent(String parent) {
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

    public CreateClientCenterClient withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this Client Center client.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this Client Center client.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateClientCenterClient withDisplayName(String displayName) {
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

    public CreateClientCenterClient withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Client's full name
     * 
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * Client's full name
     * 
     */
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public CreateClientCenterClient withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Client's date of birth.
     * 
     */
    @JsonProperty("dateOfBirth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Client's date of birth.
     * 
     */
    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public CreateClientCenterClient withDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     * client INN
     * 
     */
    @JsonProperty("inn")
    public String getInn() {
        return inn;
    }

    /**
     * client INN
     * 
     */
    @JsonProperty("inn")
    public void setInn(String inn) {
        this.inn = inn;
    }

    public CreateClientCenterClient withInn(String inn) {
        this.inn = inn;
        return this;
    }

    /**
     * Client's SNILS
     * 
     */
    @JsonProperty("snils")
    public String getSnils() {
        return snils;
    }

    /**
     * Client's SNILS
     * 
     */
    @JsonProperty("snils")
    public void setSnils(String snils) {
        this.snils = snils;
    }

    public CreateClientCenterClient withSnils(String snils) {
        this.snils = snils;
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

    public CreateClientCenterClient withStyle(Style style) {
        this.style = style;
        return this;
    }

    /**
     * Alternate names that are synonyms or near-synonyms for the Client Center client.
     * 
     */
    @JsonProperty("synonyms")
    public List<String> getSynonyms() {
        return synonyms;
    }

    /**
     * Alternate names that are synonyms or near-synonyms for the Client Center client.
     * 
     */
    @JsonProperty("synonyms")
    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    public CreateClientCenterClient withSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
        return this;
    }

    /**
     * Other array of Client Center client fully qualified names that are related to this Client Center client.
     * 
     */
    @JsonProperty("relatedClients")
    public List<String> getRelatedClients() {
        return relatedClients;
    }

    /**
     * Other array of Client Center client fully qualified names that are related to this Client Center client.
     * 
     */
    @JsonProperty("relatedClients")
    public void setRelatedClients(List<String> relatedClients) {
        this.relatedClients = relatedClients;
    }

    public CreateClientCenterClient withRelatedClients(List<String> relatedClients) {
        this.relatedClients = relatedClients;
        return this;
    }

    /**
     * Link to a reference from an external Client Center.
     * 
     */
    @JsonProperty("references")
    public List<ClientReference> getReferences() {
        return references;
    }

    /**
     * Link to a reference from an external Client Center.
     * 
     */
    @JsonProperty("references")
    public void setReferences(List<ClientReference> references) {
        this.references = references;
    }

    public CreateClientCenterClient withReferences(List<ClientReference> references) {
        this.references = references;
        return this;
    }

    /**
     * User names of the reviewers for this Client Center.
     * 
     */
    @JsonProperty("reviewers")
    public List<String> getReviewers() {
        return reviewers;
    }

    /**
     * User names of the reviewers for this Client Center.
     * 
     */
    @JsonProperty("reviewers")
    public void setReviewers(List<String> reviewers) {
        this.reviewers = reviewers;
    }

    public CreateClientCenterClient withReviewers(List<String> reviewers) {
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

    public CreateClientCenterClient withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Tags for this Client Center client.
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this Client Center client.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public CreateClientCenterClient withTags(List<TagLabel> tags) {
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

    public CreateClientCenterClient withProvider(ProviderType provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Client Center clients that are children of this client are mutually exclusive. When mutually exclusive is `true` only one client can be used to label an entity from this group. When mutually exclusive is `false`, multiple clients from this group can be used to label an entity.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public Boolean getMutuallyExclusive() {
        return mutuallyExclusive;
    }

    /**
     * Client Center clients that are children of this client are mutually exclusive. When mutually exclusive is `true` only one client can be used to label an entity from this group. When mutually exclusive is `false`, multiple clients from this group can be used to label an entity.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public void setMutuallyExclusive(Boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
    }

    public CreateClientCenterClient withMutuallyExclusive(Boolean mutuallyExclusive) {
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

    public CreateClientCenterClient withExtension(Object extension) {
        this.extension = extension;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateClientCenterClient.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("clientCenter");
        sb.append('=');
        sb.append(((this.clientCenter == null)?"<null>":this.clientCenter));
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
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
        sb.append(',');
        sb.append("inn");
        sb.append('=');
        sb.append(((this.inn == null)?"<null>":this.inn));
        sb.append(',');
        sb.append("snils");
        sb.append('=');
        sb.append(((this.snils == null)?"<null>":this.snils));
        sb.append(',');
        sb.append("style");
        sb.append('=');
        sb.append(((this.style == null)?"<null>":this.style));
        sb.append(',');
        sb.append("synonyms");
        sb.append('=');
        sb.append(((this.synonyms == null)?"<null>":this.synonyms));
        sb.append(',');
        sb.append("relatedClients");
        sb.append('=');
        sb.append(((this.relatedClients == null)?"<null>":this.relatedClients));
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
        result = ((result* 31)+((this.inn == null)? 0 :this.inn.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.dateOfBirth == null)? 0 :this.dateOfBirth.hashCode()));
        result = ((result* 31)+((this.reviewers == null)? 0 :this.reviewers.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.relatedClients == null)? 0 :this.relatedClients.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.mutuallyExclusive == null)? 0 :this.mutuallyExclusive.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.clientCenter == null)? 0 :this.clientCenter.hashCode()));
        result = ((result* 31)+((this.style == null)? 0 :this.style.hashCode()));
        result = ((result* 31)+((this.snils == null)? 0 :this.snils.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateClientCenterClient) == false) {
            return false;
        }
        CreateClientCenterClient rhs = ((CreateClientCenterClient) other);
        return ((((((((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.parent == rhs.parent)||((this.parent!= null)&&this.parent.equals(rhs.parent))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.references == rhs.references)||((this.references!= null)&&this.references.equals(rhs.references))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.synonyms == rhs.synonyms)||((this.synonyms!= null)&&this.synonyms.equals(rhs.synonyms))))&&((this.inn == rhs.inn)||((this.inn!= null)&&this.inn.equals(rhs.inn))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName))))&&((this.dateOfBirth == rhs.dateOfBirth)||((this.dateOfBirth!= null)&&this.dateOfBirth.equals(rhs.dateOfBirth))))&&((this.reviewers == rhs.reviewers)||((this.reviewers!= null)&&this.reviewers.equals(rhs.reviewers))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.relatedClients == rhs.relatedClients)||((this.relatedClients!= null)&&this.relatedClients.equals(rhs.relatedClients))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.mutuallyExclusive == rhs.mutuallyExclusive)||((this.mutuallyExclusive!= null)&&this.mutuallyExclusive.equals(rhs.mutuallyExclusive))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.clientCenter == rhs.clientCenter)||((this.clientCenter!= null)&&this.clientCenter.equals(rhs.clientCenter))))&&((this.style == rhs.style)||((this.style!= null)&&this.style.equals(rhs.style))))&&((this.snils == rhs.snils)||((this.snils!= null)&&this.snils.equals(rhs.snils))));
    }

}
