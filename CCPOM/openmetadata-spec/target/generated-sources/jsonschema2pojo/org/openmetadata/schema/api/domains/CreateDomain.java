
package org.openmetadata.schema.api.domains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import org.openmetadata.schema.CreateEntity;
import org.openmetadata.schema.entity.type.Style;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.TagLabel;


/**
 * CreateDomainRequest
 * <p>
 * Create Domain API request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "domainType",
    "name",
    "fullyQualifiedName",
    "displayName",
    "fullName",
    "domainOwner",
    "domainTechLeader",
    "description",
    "dataSourcesList",
    "domainTeam",
    "domainQuotasList",
    "tags",
    "style",
    "parent",
    "owner",
    "experts"
})
@Generated("jsonschema2pojo")
public class CreateDomain implements CreateEntity
{

    /**
     * Type of a domain
     * (Required)
     * 
     */
    @JsonProperty("domainType")
    @JsonPropertyDescription("Type of a domain")
    @NotNull
    private CreateDomain.DomainType domainType;
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
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String fullyQualifiedName;
    /**
     * Name used for display purposes. Example 'Marketing', 'Payments', etc.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Name used for display purposes. Example 'Marketing', 'Payments', etc.")
    private String displayName;
    /**
     * full domain name
     * 
     */
    @JsonProperty("fullName")
    @JsonPropertyDescription("full domain name")
    private String fullName;
    /**
     * Domain owner name
     * 
     */
    @JsonProperty("domainOwner")
    @JsonPropertyDescription("Domain owner name")
    private String domainOwner;
    /**
     * Domain tech leader name
     * 
     */
    @JsonProperty("domainTechLeader")
    @JsonPropertyDescription("Domain tech leader name")
    private String domainTechLeader;
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
     * Data sources list
     * 
     */
    @JsonProperty("dataSourcesList")
    @JsonPropertyDescription("Data sources list")
    @Valid
    private List<DataSourceEl> dataSourcesList = new ArrayList<DataSourceEl>();
    /**
     * Domain team
     * 
     */
    @JsonProperty("domainTeam")
    @JsonPropertyDescription("Domain team")
    @Valid
    private List<DomainTeamMember> domainTeam = new ArrayList<DomainTeamMember>();
    /**
     * Domain quotas
     * 
     */
    @JsonProperty("domainQuotasList")
    @JsonPropertyDescription("Domain quotas")
    @Valid
    private List<DomainQuota> domainQuotasList = new ArrayList<DomainQuota>();
    /**
     * Tags for this Domain.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this Domain.")
    @Valid
    private List<TagLabel> tags = null;
    /**
     * UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.
     * 
     */
    @JsonProperty("style")
    @JsonPropertyDescription("UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.")
    @Valid
    private Style style;
    /**
     * Fully qualified name of parent domain.
     * 
     */
    @JsonProperty("parent")
    @JsonPropertyDescription("Fully qualified name of parent domain.")
    private String parent;
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
     * List of user/login names of users who are experts in this Domain.
     * 
     */
    @JsonProperty("experts")
    @JsonPropertyDescription("List of user/login names of users who are experts in this Domain.")
    @Valid
    private List<String> experts = null;

    /**
     * Type of a domain
     * (Required)
     * 
     */
    @JsonProperty("domainType")
    public CreateDomain.DomainType getDomainType() {
        return domainType;
    }

    /**
     * Type of a domain
     * (Required)
     * 
     */
    @JsonProperty("domainType")
    public void setDomainType(CreateDomain.DomainType domainType) {
        this.domainType = domainType;
    }

    public CreateDomain withDomainType(CreateDomain.DomainType domainType) {
        this.domainType = domainType;
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

    public CreateDomain withName(String name) {
        this.name = name;
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

    public CreateDomain withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
        return this;
    }

    /**
     * Name used for display purposes. Example 'Marketing', 'Payments', etc.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Name used for display purposes. Example 'Marketing', 'Payments', etc.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateDomain withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * full domain name
     * 
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * full domain name
     * 
     */
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public CreateDomain withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Domain owner name
     * 
     */
    @JsonProperty("domainOwner")
    public String getDomainOwner() {
        return domainOwner;
    }

    /**
     * Domain owner name
     * 
     */
    @JsonProperty("domainOwner")
    public void setDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
    }

    public CreateDomain withDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
        return this;
    }

    /**
     * Domain tech leader name
     * 
     */
    @JsonProperty("domainTechLeader")
    public String getDomainTechLeader() {
        return domainTechLeader;
    }

    /**
     * Domain tech leader name
     * 
     */
    @JsonProperty("domainTechLeader")
    public void setDomainTechLeader(String domainTechLeader) {
        this.domainTechLeader = domainTechLeader;
    }

    public CreateDomain withDomainTechLeader(String domainTechLeader) {
        this.domainTechLeader = domainTechLeader;
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

    public CreateDomain withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Data sources list
     * 
     */
    @JsonProperty("dataSourcesList")
    public List<DataSourceEl> getDataSourcesList() {
        return dataSourcesList;
    }

    /**
     * Data sources list
     * 
     */
    @JsonProperty("dataSourcesList")
    public void setDataSourcesList(List<DataSourceEl> dataSourcesList) {
        this.dataSourcesList = dataSourcesList;
    }

    public CreateDomain withDataSourcesList(List<DataSourceEl> dataSourcesList) {
        this.dataSourcesList = dataSourcesList;
        return this;
    }

    /**
     * Domain team
     * 
     */
    @JsonProperty("domainTeam")
    public List<DomainTeamMember> getDomainTeam() {
        return domainTeam;
    }

    /**
     * Domain team
     * 
     */
    @JsonProperty("domainTeam")
    public void setDomainTeam(List<DomainTeamMember> domainTeam) {
        this.domainTeam = domainTeam;
    }

    public CreateDomain withDomainTeam(List<DomainTeamMember> domainTeam) {
        this.domainTeam = domainTeam;
        return this;
    }

    /**
     * Domain quotas
     * 
     */
    @JsonProperty("domainQuotasList")
    public List<DomainQuota> getDomainQuotasList() {
        return domainQuotasList;
    }

    /**
     * Domain quotas
     * 
     */
    @JsonProperty("domainQuotasList")
    public void setDomainQuotasList(List<DomainQuota> domainQuotasList) {
        this.domainQuotasList = domainQuotasList;
    }

    public CreateDomain withDomainQuotasList(List<DomainQuota> domainQuotasList) {
        this.domainQuotasList = domainQuotasList;
        return this;
    }

    /**
     * Tags for this Domain.
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this Domain.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public CreateDomain withTags(List<TagLabel> tags) {
        this.tags = tags;
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

    public CreateDomain withStyle(Style style) {
        this.style = style;
        return this;
    }

    /**
     * Fully qualified name of parent domain.
     * 
     */
    @JsonProperty("parent")
    public String getParent() {
        return parent;
    }

    /**
     * Fully qualified name of parent domain.
     * 
     */
    @JsonProperty("parent")
    public void setParent(String parent) {
        this.parent = parent;
    }

    public CreateDomain withParent(String parent) {
        this.parent = parent;
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

    public CreateDomain withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * List of user/login names of users who are experts in this Domain.
     * 
     */
    @JsonProperty("experts")
    public List<String> getExperts() {
        return experts;
    }

    /**
     * List of user/login names of users who are experts in this Domain.
     * 
     */
    @JsonProperty("experts")
    public void setExperts(List<String> experts) {
        this.experts = experts;
    }

    public CreateDomain withExperts(List<String> experts) {
        this.experts = experts;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateDomain.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("domainType");
        sb.append('=');
        sb.append(((this.domainType == null)?"<null>":this.domainType));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("domainOwner");
        sb.append('=');
        sb.append(((this.domainOwner == null)?"<null>":this.domainOwner));
        sb.append(',');
        sb.append("domainTechLeader");
        sb.append('=');
        sb.append(((this.domainTechLeader == null)?"<null>":this.domainTechLeader));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("dataSourcesList");
        sb.append('=');
        sb.append(((this.dataSourcesList == null)?"<null>":this.dataSourcesList));
        sb.append(',');
        sb.append("domainTeam");
        sb.append('=');
        sb.append(((this.domainTeam == null)?"<null>":this.domainTeam));
        sb.append(',');
        sb.append("domainQuotasList");
        sb.append('=');
        sb.append(((this.domainQuotasList == null)?"<null>":this.domainQuotasList));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("style");
        sb.append('=');
        sb.append(((this.style == null)?"<null>":this.style));
        sb.append(',');
        sb.append("parent");
        sb.append('=');
        sb.append(((this.parent == null)?"<null>":this.parent));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("experts");
        sb.append('=');
        sb.append(((this.experts == null)?"<null>":this.experts));
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
        result = ((result* 31)+((this.domainType == null)? 0 :this.domainType.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.domainTechLeader == null)? 0 :this.domainTechLeader.hashCode()));
        result = ((result* 31)+((this.domainQuotasList == null)? 0 :this.domainQuotasList.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.domainOwner == null)? 0 :this.domainOwner.hashCode()));
        result = ((result* 31)+((this.domainTeam == null)? 0 :this.domainTeam.hashCode()));
        result = ((result* 31)+((this.style == null)? 0 :this.style.hashCode()));
        result = ((result* 31)+((this.experts == null)? 0 :this.experts.hashCode()));
        result = ((result* 31)+((this.dataSourcesList == null)? 0 :this.dataSourcesList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateDomain) == false) {
            return false;
        }
        CreateDomain rhs = ((CreateDomain) other);
        return (((((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.parent == rhs.parent)||((this.parent!= null)&&this.parent.equals(rhs.parent))))&&((this.domainType == rhs.domainType)||((this.domainType!= null)&&this.domainType.equals(rhs.domainType))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.domainTechLeader == rhs.domainTechLeader)||((this.domainTechLeader!= null)&&this.domainTechLeader.equals(rhs.domainTechLeader))))&&((this.domainQuotasList == rhs.domainQuotasList)||((this.domainQuotasList!= null)&&this.domainQuotasList.equals(rhs.domainQuotasList))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.domainOwner == rhs.domainOwner)||((this.domainOwner!= null)&&this.domainOwner.equals(rhs.domainOwner))))&&((this.domainTeam == rhs.domainTeam)||((this.domainTeam!= null)&&this.domainTeam.equals(rhs.domainTeam))))&&((this.style == rhs.style)||((this.style!= null)&&this.style.equals(rhs.style))))&&((this.experts == rhs.experts)||((this.experts!= null)&&this.experts.equals(rhs.experts))))&&((this.dataSourcesList == rhs.dataSourcesList)||((this.dataSourcesList!= null)&&this.dataSourcesList.equals(rhs.dataSourcesList))));
    }


    /**
     * Type of a domain
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DomainType {

        SOURCE_ALIGNED("Source-aligned"),
        CONSUMER_ALIGNED("Consumer-aligned"),
        AGGREGATE("Aggregate");
        private final String value;
        private final static Map<String, CreateDomain.DomainType> CONSTANTS = new HashMap<String, CreateDomain.DomainType>();

        static {
            for (CreateDomain.DomainType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DomainType(String value) {
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
        public static CreateDomain.DomainType fromValue(String value) {
            CreateDomain.DomainType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
