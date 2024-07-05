
package org.openmetadata.schema.api.teams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Email;
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
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.Profile;


/**
 * CreateTeamRequest
 * <p>
 * Team entity
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "teamType",
    "name",
    "email",
    "displayName",
    "description",
    "profile",
    "parents",
    "children",
    "users",
    "defaultRoles",
    "owner",
    "isJoinable",
    "policies",
    "domain"
})
@Generated("jsonschema2pojo")
public class CreateTeam implements CreateEntity
{

    /**
     * Organization is the highest level entity. An Organization has one of more Business Units, Division, Departments, Group, or Users. A Business Unit has one or more Divisions, Departments, Group, or Users. A Division has one or more Divisions, Departments, Group, or Users. A Department has one or more Departments, Group, or Users. A Group has only Users
     * (Required)
     * 
     */
    @JsonProperty("teamType")
    @JsonPropertyDescription("Organization is the highest level entity. An Organization has one of more Business Units, Division, Departments, Group, or Users. A Business Unit has one or more Divisions, Departments, Group, or Users. A Division has one or more Divisions, Departments, Group, or Users. A Department has one or more Departments, Group, or Users. A Group has only Users")
    @NotNull
    private CreateTeam.TeamType teamType = CreateTeam.TeamType.fromValue("Group");
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
     * Email address of a user or other entities.@om-field-type
     * 
     */
    @Email
    @JsonProperty("email")
    @JsonPropertyDescription("Email address of a user or other entities.")
    @Pattern(regexp = "^[\\S.!#$%&\u2019*+/=?^_`{|}~-]+@\\S+\\.\\S+$")
    @Size(min = 6, max = 127)
    private String email;
    /**
     * Optional name used for display purposes. Example 'Marketing Team'.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Optional name used for display purposes. Example 'Marketing Team'.")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * Profile
     * <p>
     * This schema defines the type for a profile of a user, team, or organization.
     * 
     */
    @JsonProperty("profile")
    @JsonPropertyDescription("This schema defines the type for a profile of a user, team, or organization.")
    @Valid
    private Profile profile;
    /**
     * Parent teams. For an `Organization` the `parent` is always null. A `BusinessUnit` always has only one parent of type `BusinessUnit` or an `Organization`. A `Division` can have multiple parents of type `BusinessUnit` or `Division`. A `Department` can have multiple parents of type `Division` or `Department`.
     * 
     */
    @JsonProperty("parents")
    @JsonPropertyDescription("Parent teams. For an `Organization` the `parent` is always null. A `BusinessUnit` always has only one parent of type `BusinessUnit` or an `Organization`. A `Division` can have multiple parents of type `BusinessUnit` or `Division`. A `Department` can have multiple parents of type `Division` or `Department`.")
    @Valid
    private List<UUID> parents = null;
    /**
     * Children teams. An `Organization` can have `BusinessUnit`, `Division` or `Department` as children. A `BusinessUnit` can have `BusinessUnit`, `Division`, or `Department` as children. A `Division` can have `Division` or `Department` as children. A `Department` can have `Department` as children.
     * 
     */
    @JsonProperty("children")
    @JsonPropertyDescription("Children teams. An `Organization` can have `BusinessUnit`, `Division` or `Department` as children. A `BusinessUnit` can have `BusinessUnit`, `Division`, or `Department` as children. A `Division` can have `Division` or `Department` as children. A `Department` can have `Department` as children.")
    @Valid
    private List<UUID> children = null;
    /**
     * Optional IDs of users that are part of the team.
     * 
     */
    @JsonProperty("users")
    @JsonPropertyDescription("Optional IDs of users that are part of the team.")
    @Valid
    private List<UUID> users = null;
    /**
     * Roles to be assigned to all users that are part of this team.
     * 
     */
    @JsonProperty("defaultRoles")
    @JsonPropertyDescription("Roles to be assigned to all users that are part of this team.")
    @Valid
    private List<UUID> defaultRoles = null;
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
     * Can any user join this team during sign up? Value of true indicates yes, and false no.
     * 
     */
    @JsonProperty("isJoinable")
    @JsonPropertyDescription("Can any user join this team during sign up? Value of true indicates yes, and false no.")
    private Boolean isJoinable = true;
    /**
     * Policies that is attached to this team.
     * 
     */
    @JsonProperty("policies")
    @JsonPropertyDescription("Policies that is attached to this team.")
    @Valid
    private List<UUID> policies = null;
    /**
     * Fully qualified name of the domain the Team belongs to.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("Fully qualified name of the domain the Team belongs to.")
    private String domain;

    /**
     * Organization is the highest level entity. An Organization has one of more Business Units, Division, Departments, Group, or Users. A Business Unit has one or more Divisions, Departments, Group, or Users. A Division has one or more Divisions, Departments, Group, or Users. A Department has one or more Departments, Group, or Users. A Group has only Users
     * (Required)
     * 
     */
    @JsonProperty("teamType")
    public CreateTeam.TeamType getTeamType() {
        return teamType;
    }

    /**
     * Organization is the highest level entity. An Organization has one of more Business Units, Division, Departments, Group, or Users. A Business Unit has one or more Divisions, Departments, Group, or Users. A Division has one or more Divisions, Departments, Group, or Users. A Department has one or more Departments, Group, or Users. A Group has only Users
     * (Required)
     * 
     */
    @JsonProperty("teamType")
    public void setTeamType(CreateTeam.TeamType teamType) {
        this.teamType = teamType;
    }

    public CreateTeam withTeamType(CreateTeam.TeamType teamType) {
        this.teamType = teamType;
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

    public CreateTeam withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Email address of a user or other entities.@om-field-type
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Email address of a user or other entities.@om-field-type
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public CreateTeam withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Optional name used for display purposes. Example 'Marketing Team'.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Optional name used for display purposes. Example 'Marketing Team'.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateTeam withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public CreateTeam withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Profile
     * <p>
     * This schema defines the type for a profile of a user, team, or organization.
     * 
     */
    @JsonProperty("profile")
    public Profile getProfile() {
        return profile;
    }

    /**
     * Profile
     * <p>
     * This schema defines the type for a profile of a user, team, or organization.
     * 
     */
    @JsonProperty("profile")
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public CreateTeam withProfile(Profile profile) {
        this.profile = profile;
        return this;
    }

    /**
     * Parent teams. For an `Organization` the `parent` is always null. A `BusinessUnit` always has only one parent of type `BusinessUnit` or an `Organization`. A `Division` can have multiple parents of type `BusinessUnit` or `Division`. A `Department` can have multiple parents of type `Division` or `Department`.
     * 
     */
    @JsonProperty("parents")
    public List<UUID> getParents() {
        return parents;
    }

    /**
     * Parent teams. For an `Organization` the `parent` is always null. A `BusinessUnit` always has only one parent of type `BusinessUnit` or an `Organization`. A `Division` can have multiple parents of type `BusinessUnit` or `Division`. A `Department` can have multiple parents of type `Division` or `Department`.
     * 
     */
    @JsonProperty("parents")
    public void setParents(List<UUID> parents) {
        this.parents = parents;
    }

    public CreateTeam withParents(List<UUID> parents) {
        this.parents = parents;
        return this;
    }

    /**
     * Children teams. An `Organization` can have `BusinessUnit`, `Division` or `Department` as children. A `BusinessUnit` can have `BusinessUnit`, `Division`, or `Department` as children. A `Division` can have `Division` or `Department` as children. A `Department` can have `Department` as children.
     * 
     */
    @JsonProperty("children")
    public List<UUID> getChildren() {
        return children;
    }

    /**
     * Children teams. An `Organization` can have `BusinessUnit`, `Division` or `Department` as children. A `BusinessUnit` can have `BusinessUnit`, `Division`, or `Department` as children. A `Division` can have `Division` or `Department` as children. A `Department` can have `Department` as children.
     * 
     */
    @JsonProperty("children")
    public void setChildren(List<UUID> children) {
        this.children = children;
    }

    public CreateTeam withChildren(List<UUID> children) {
        this.children = children;
        return this;
    }

    /**
     * Optional IDs of users that are part of the team.
     * 
     */
    @JsonProperty("users")
    public List<UUID> getUsers() {
        return users;
    }

    /**
     * Optional IDs of users that are part of the team.
     * 
     */
    @JsonProperty("users")
    public void setUsers(List<UUID> users) {
        this.users = users;
    }

    public CreateTeam withUsers(List<UUID> users) {
        this.users = users;
        return this;
    }

    /**
     * Roles to be assigned to all users that are part of this team.
     * 
     */
    @JsonProperty("defaultRoles")
    public List<UUID> getDefaultRoles() {
        return defaultRoles;
    }

    /**
     * Roles to be assigned to all users that are part of this team.
     * 
     */
    @JsonProperty("defaultRoles")
    public void setDefaultRoles(List<UUID> defaultRoles) {
        this.defaultRoles = defaultRoles;
    }

    public CreateTeam withDefaultRoles(List<UUID> defaultRoles) {
        this.defaultRoles = defaultRoles;
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

    public CreateTeam withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Can any user join this team during sign up? Value of true indicates yes, and false no.
     * 
     */
    @JsonProperty("isJoinable")
    public Boolean getIsJoinable() {
        return isJoinable;
    }

    /**
     * Can any user join this team during sign up? Value of true indicates yes, and false no.
     * 
     */
    @JsonProperty("isJoinable")
    public void setIsJoinable(Boolean isJoinable) {
        this.isJoinable = isJoinable;
    }

    public CreateTeam withIsJoinable(Boolean isJoinable) {
        this.isJoinable = isJoinable;
        return this;
    }

    /**
     * Policies that is attached to this team.
     * 
     */
    @JsonProperty("policies")
    public List<UUID> getPolicies() {
        return policies;
    }

    /**
     * Policies that is attached to this team.
     * 
     */
    @JsonProperty("policies")
    public void setPolicies(List<UUID> policies) {
        this.policies = policies;
    }

    public CreateTeam withPolicies(List<UUID> policies) {
        this.policies = policies;
        return this;
    }

    /**
     * Fully qualified name of the domain the Team belongs to.
     * 
     */
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    /**
     * Fully qualified name of the domain the Team belongs to.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CreateTeam withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateTeam.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("teamType");
        sb.append('=');
        sb.append(((this.teamType == null)?"<null>":this.teamType));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("profile");
        sb.append('=');
        sb.append(((this.profile == null)?"<null>":this.profile));
        sb.append(',');
        sb.append("parents");
        sb.append('=');
        sb.append(((this.parents == null)?"<null>":this.parents));
        sb.append(',');
        sb.append("children");
        sb.append('=');
        sb.append(((this.children == null)?"<null>":this.children));
        sb.append(',');
        sb.append("users");
        sb.append('=');
        sb.append(((this.users == null)?"<null>":this.users));
        sb.append(',');
        sb.append("defaultRoles");
        sb.append('=');
        sb.append(((this.defaultRoles == null)?"<null>":this.defaultRoles));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("isJoinable");
        sb.append('=');
        sb.append(((this.isJoinable == null)?"<null>":this.isJoinable));
        sb.append(',');
        sb.append("policies");
        sb.append('=');
        sb.append(((this.policies == null)?"<null>":this.policies));
        sb.append(',');
        sb.append("domain");
        sb.append('=');
        sb.append(((this.domain == null)?"<null>":this.domain));
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
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.profile == null)? 0 :this.profile.hashCode()));
        result = ((result* 31)+((this.policies == null)? 0 :this.policies.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.users == null)? 0 :this.users.hashCode()));
        result = ((result* 31)+((this.children == null)? 0 :this.children.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.defaultRoles == null)? 0 :this.defaultRoles.hashCode()));
        result = ((result* 31)+((this.teamType == null)? 0 :this.teamType.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.isJoinable == null)? 0 :this.isJoinable.hashCode()));
        result = ((result* 31)+((this.parents == null)? 0 :this.parents.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateTeam) == false) {
            return false;
        }
        CreateTeam rhs = ((CreateTeam) other);
        return (((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.profile == rhs.profile)||((this.profile!= null)&&this.profile.equals(rhs.profile))))&&((this.policies == rhs.policies)||((this.policies!= null)&&this.policies.equals(rhs.policies))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.users == rhs.users)||((this.users!= null)&&this.users.equals(rhs.users))))&&((this.children == rhs.children)||((this.children!= null)&&this.children.equals(rhs.children))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.defaultRoles == rhs.defaultRoles)||((this.defaultRoles!= null)&&this.defaultRoles.equals(rhs.defaultRoles))))&&((this.teamType == rhs.teamType)||((this.teamType!= null)&&this.teamType.equals(rhs.teamType))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.isJoinable == rhs.isJoinable)||((this.isJoinable!= null)&&this.isJoinable.equals(rhs.isJoinable))))&&((this.parents == rhs.parents)||((this.parents!= null)&&this.parents.equals(rhs.parents))));
    }


    /**
     * Organization is the highest level entity. An Organization has one of more Business Units, Division, Departments, Group, or Users. A Business Unit has one or more Divisions, Departments, Group, or Users. A Division has one or more Divisions, Departments, Group, or Users. A Department has one or more Departments, Group, or Users. A Group has only Users
     * 
     */
    @Generated("jsonschema2pojo")
    public enum TeamType {

        GROUP("Group"),
        DEPARTMENT("Department"),
        DIVISION("Division"),
        BUSINESS_UNIT("BusinessUnit"),
        ORGANIZATION("Organization");
        private final String value;
        private final static Map<String, CreateTeam.TeamType> CONSTANTS = new HashMap<String, CreateTeam.TeamType>();

        static {
            for (CreateTeam.TeamType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TeamType(String value) {
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
        public static CreateTeam.TeamType fromValue(String value) {
            CreateTeam.TeamType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
