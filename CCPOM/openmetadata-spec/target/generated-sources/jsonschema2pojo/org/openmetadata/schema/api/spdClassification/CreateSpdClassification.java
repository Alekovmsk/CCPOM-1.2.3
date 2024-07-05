
package org.openmetadata.schema.api.spdClassification;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.CreateEntity;
import org.openmetadata.schema.type.ProviderType;


/**
 * CreateSpdClassificationRequest
 * <p>
 * Create spd classification request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "provider",
    "mutuallyExclusive"
})
@Generated("jsonschema2pojo")
public class CreateSpdClassification implements CreateEntity
{

    /**
     * Name of the spd.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the spd.")
    @Pattern(regexp = "^(?U)[\\w'\\- .&()]+$")
    @Size(min = 2, max = 64)
    @NotNull
    private String name;
    /**
     * Display Name that identifies this spd classification.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this spd classification.")
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
     * Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.
     * 
     */
    @JsonProperty("provider")
    @JsonPropertyDescription("Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.")
    private ProviderType provider = ProviderType.fromValue("user");
    /**
     * Spds under this spd classification are mutually exclusive. When mutually exclusive is `true` the spds from this spd classification are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the spds from this spd classification are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    @JsonPropertyDescription("Spds under this spd classification are mutually exclusive. When mutually exclusive is `true` the spds from this spd classification are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the spds from this spd classification are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.")
    private Boolean mutuallyExclusive = false;

    /**
     * Name of the spd.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the spd.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CreateSpdClassification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this spd classification.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this spd classification.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateSpdClassification withDisplayName(String displayName) {
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

    public CreateSpdClassification withDescription(String description) {
        this.description = description;
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

    public CreateSpdClassification withProvider(ProviderType provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Spds under this spd classification are mutually exclusive. When mutually exclusive is `true` the spds from this spd classification are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the spds from this spd classification are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public Boolean getMutuallyExclusive() {
        return mutuallyExclusive;
    }

    /**
     * Spds under this spd classification are mutually exclusive. When mutually exclusive is `true` the spds from this spd classification are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the spds from this spd classification are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public void setMutuallyExclusive(Boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
    }

    public CreateSpdClassification withMutuallyExclusive(Boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateSpdClassification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("provider");
        sb.append('=');
        sb.append(((this.provider == null)?"<null>":this.provider));
        sb.append(',');
        sb.append("mutuallyExclusive");
        sb.append('=');
        sb.append(((this.mutuallyExclusive == null)?"<null>":this.mutuallyExclusive));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.mutuallyExclusive == null)? 0 :this.mutuallyExclusive.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateSpdClassification) == false) {
            return false;
        }
        CreateSpdClassification rhs = ((CreateSpdClassification) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.mutuallyExclusive == rhs.mutuallyExclusive)||((this.mutuallyExclusive!= null)&&this.mutuallyExclusive.equals(rhs.mutuallyExclusive))));
    }

}
