
package org.openmetadata.schema.entity.teams;

import java.net.URI;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Team Hierarchy
 * <p>
 * This schema defines the Team entity with Hierarchy. Hierarchical teams are supported `Organization` -> `BusinessUnit` -> `Division` -> `Department` -> `Group`.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "teamType",
    "name",
    "description",
    "fullyQualifiedName",
    "displayName",
    "href",
    "children",
    "isJoinable"
})
@Generated("jsonschema2pojo")
public class TeamHierarchy {

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
     * Organization is the highest level entity. An Organization has one of more Business Units, Division, Departments, Group, or Users. A Business Unit has one or more Divisions, Departments, Group, or Users. A Division has one or more Divisions, Departments, Group, or Users. A Department has one or more Departments, Group, or Users. A Group has only Users
     * 
     */
    @JsonProperty("teamType")
    @JsonPropertyDescription("Organization is the highest level entity. An Organization has one of more Business Units, Division, Departments, Group, or Users. A Business Unit has one or more Divisions, Departments, Group, or Users. A Division has one or more Divisions, Departments, Group, or Users. A Department has one or more Departments, Group, or Users. A Group has only Users")
    private org.openmetadata.schema.api.teams.CreateTeam.TeamType teamType = org.openmetadata.schema.api.teams.CreateTeam.TeamType.fromValue("Group");
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
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String fullyQualifiedName;
    /**
     * Name used for display purposes. Example 'Data Science team'.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Name used for display purposes. Example 'Data Science team'.")
    private String displayName;
    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    @JsonPropertyDescription("URI that points to a resource.")
    private URI href;
    @JsonProperty("children")
    @Valid
    private List<TeamHierarchy> children = null;
    /**
     * Can any user join this team during sign up? Value of true indicates yes, and false no.
     * 
     */
    @JsonProperty("isJoinable")
    @JsonPropertyDescription("Can any user join this team during sign up? Value of true indicates yes, and false no.")
    private Boolean isJoinable = true;

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

    public TeamHierarchy withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Organization is the highest level entity. An Organization has one of more Business Units, Division, Departments, Group, or Users. A Business Unit has one or more Divisions, Departments, Group, or Users. A Division has one or more Divisions, Departments, Group, or Users. A Department has one or more Departments, Group, or Users. A Group has only Users
     * 
     */
    @JsonProperty("teamType")
    public org.openmetadata.schema.api.teams.CreateTeam.TeamType getTeamType() {
        return teamType;
    }

    /**
     * Organization is the highest level entity. An Organization has one of more Business Units, Division, Departments, Group, or Users. A Business Unit has one or more Divisions, Departments, Group, or Users. A Division has one or more Divisions, Departments, Group, or Users. A Department has one or more Departments, Group, or Users. A Group has only Users
     * 
     */
    @JsonProperty("teamType")
    public void setTeamType(org.openmetadata.schema.api.teams.CreateTeam.TeamType teamType) {
        this.teamType = teamType;
    }

    public TeamHierarchy withTeamType(org.openmetadata.schema.api.teams.CreateTeam.TeamType teamType) {
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

    public TeamHierarchy withName(String name) {
        this.name = name;
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

    public TeamHierarchy withDescription(String description) {
        this.description = description;
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

    public TeamHierarchy withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
        return this;
    }

    /**
     * Name used for display purposes. Example 'Data Science team'.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Name used for display purposes. Example 'Data Science team'.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public TeamHierarchy withDisplayName(String displayName) {
        this.displayName = displayName;
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

    public TeamHierarchy withHref(URI href) {
        this.href = href;
        return this;
    }

    @JsonProperty("children")
    public List<TeamHierarchy> getChildren() {
        return children;
    }

    @JsonProperty("children")
    public void setChildren(List<TeamHierarchy> children) {
        this.children = children;
    }

    public TeamHierarchy withChildren(List<TeamHierarchy> children) {
        this.children = children;
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

    public TeamHierarchy withIsJoinable(Boolean isJoinable) {
        this.isJoinable = isJoinable;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TeamHierarchy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("teamType");
        sb.append('=');
        sb.append(((this.teamType == null)?"<null>":this.teamType));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
        sb.append(',');
        sb.append("children");
        sb.append('=');
        sb.append(((this.children == null)?"<null>":this.children));
        sb.append(',');
        sb.append("isJoinable");
        sb.append('=');
        sb.append(((this.isJoinable == null)?"<null>":this.isJoinable));
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
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.teamType == null)? 0 :this.teamType.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.isJoinable == null)? 0 :this.isJoinable.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TeamHierarchy) == false) {
            return false;
        }
        TeamHierarchy rhs = ((TeamHierarchy) other);
        return (((((((((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.teamType == rhs.teamType)||((this.teamType!= null)&&this.teamType.equals(rhs.teamType))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.isJoinable == rhs.isJoinable)||((this.isJoinable!= null)&&this.isJoinable.equals(rhs.isJoinable))));
    }

}
