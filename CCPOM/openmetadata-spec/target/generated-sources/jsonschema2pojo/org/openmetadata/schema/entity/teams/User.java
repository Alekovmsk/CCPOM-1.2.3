
package org.openmetadata.schema.entity.teams;

import java.net.URI;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.EntityInterface;
import org.openmetadata.schema.type.ChangeDescription;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.Profile;


/**
 * User
 * <p>
 * A `User` represents a user of OpenMetadata. A user can be part of 0 or more teams. A special type of user called Bot is used for automation. A user can be an owner of zero or more data assets. A user can also follow zero or more data assets.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "fullyQualifiedName",
    "description",
    "displayName",
    "version",
    "updatedAt",
    "updatedBy",
    "email",
    "href",
    "timezone",
    "isBot",
    "isAdmin",
    "authenticationMechanism",
    "profile",
    "teams",
    "defaultPersona",
    "personas",
    "owns",
    "follows",
    "changeDescription",
    "deleted",
    "roles",
    "inheritedRoles",
    "isEmailVerified",
    "domain"
})
@Generated("jsonschema2pojo")
public class User implements EntityInterface
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
     * Login name of the user, typically the user ID from an identity provider. Example - uid from LDAP.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Login name of the user, typically the user ID from an identity provider. Example - uid from LDAP.")
    @Pattern(regexp = "^(?U)[\\w\\-.]+$")
    @Size(min = 1, max = 64)
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
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * Name used for display purposes. Example 'FirstName LastName'.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Name used for display purposes. Example 'FirstName LastName'.")
    private String displayName;
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
     * Email address of a user or other entities.@om-field-type
     * (Required)
     * 
     */
    @Email
    @JsonProperty("email")
    @JsonPropertyDescription("Email address of a user or other entities.")
    @Pattern(regexp = "^[\\S.!#$%&\u2019*+/=?^_`{|}~-]+@\\S+\\.\\S+$")
    @Size(min = 6, max = 127)
    @NotNull
    private String email;
    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    @JsonPropertyDescription("URI that points to a resource.")
    private URI href;
    /**
     * Timezone of the user.
     * 
     */
    @JsonProperty("timezone")
    @JsonPropertyDescription("Timezone of the user.")
    private String timezone;
    /**
     * When true indicates a special type of user called Bot.
     * 
     */
    @JsonProperty("isBot")
    @JsonPropertyDescription("When true indicates a special type of user called Bot.")
    private Boolean isBot;
    /**
     * When true indicates user is an administrator for the system with superuser privileges.
     * 
     */
    @JsonProperty("isAdmin")
    @JsonPropertyDescription("When true indicates user is an administrator for the system with superuser privileges.")
    private Boolean isAdmin;
    /**
     * User/Bot Authentication Mechanism.
     * 
     */
    @JsonProperty("authenticationMechanism")
    @JsonPropertyDescription("User/Bot Authentication Mechanism.")
    @Valid
    private AuthenticationMechanism authenticationMechanism;
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
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("teams")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> teams = null;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("defaultPersona")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference defaultPersona;
    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("personas")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> personas = null;
    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("owns")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> owns = null;
    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("follows")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> follows = null;
    /**
     * Description of the change.
     * 
     */
    @JsonProperty("changeDescription")
    @JsonPropertyDescription("Description of the change.")
    @Valid
    private ChangeDescription changeDescription;
    /**
     * When `true` indicates the entity has been soft deleted.
     * 
     */
    @JsonProperty("deleted")
    @JsonPropertyDescription("When `true` indicates the entity has been soft deleted.")
    private Boolean deleted = false;
    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("roles")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> roles = null;
    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("inheritedRoles")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> inheritedRoles = null;
    /**
     * If the User has verified the mail
     * 
     */
    @JsonProperty("isEmailVerified")
    @JsonPropertyDescription("If the User has verified the mail")
    private Boolean isEmailVerified;
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

    public User withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Login name of the user, typically the user ID from an identity provider. Example - uid from LDAP.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Login name of the user, typically the user ID from an identity provider. Example - uid from LDAP.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public User withName(String name) {
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

    public User withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
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

    public User withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Name used for display purposes. Example 'FirstName LastName'.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Name used for display purposes. Example 'FirstName LastName'.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public User withDisplayName(String displayName) {
        this.displayName = displayName;
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

    public User withVersion(Double version) {
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

    public User withUpdatedAt(Long updatedAt) {
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

    public User withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * Email address of a user or other entities.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Email address of a user or other entities.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public User withEmail(String email) {
        this.email = email;
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

    public User withHref(URI href) {
        this.href = href;
        return this;
    }

    /**
     * Timezone of the user.
     * 
     */
    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    /**
     * Timezone of the user.
     * 
     */
    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public User withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * When true indicates a special type of user called Bot.
     * 
     */
    @JsonProperty("isBot")
    public Boolean getIsBot() {
        return isBot;
    }

    /**
     * When true indicates a special type of user called Bot.
     * 
     */
    @JsonProperty("isBot")
    public void setIsBot(Boolean isBot) {
        this.isBot = isBot;
    }

    public User withIsBot(Boolean isBot) {
        this.isBot = isBot;
        return this;
    }

    /**
     * When true indicates user is an administrator for the system with superuser privileges.
     * 
     */
    @JsonProperty("isAdmin")
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    /**
     * When true indicates user is an administrator for the system with superuser privileges.
     * 
     */
    @JsonProperty("isAdmin")
    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public User withIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }

    /**
     * User/Bot Authentication Mechanism.
     * 
     */
    @JsonProperty("authenticationMechanism")
    public AuthenticationMechanism getAuthenticationMechanism() {
        return authenticationMechanism;
    }

    /**
     * User/Bot Authentication Mechanism.
     * 
     */
    @JsonProperty("authenticationMechanism")
    public void setAuthenticationMechanism(AuthenticationMechanism authenticationMechanism) {
        this.authenticationMechanism = authenticationMechanism;
    }

    public User withAuthenticationMechanism(AuthenticationMechanism authenticationMechanism) {
        this.authenticationMechanism = authenticationMechanism;
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

    public User withProfile(Profile profile) {
        this.profile = profile;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("teams")
    public List<EntityReference> getTeams() {
        return teams;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("teams")
    public void setTeams(List<EntityReference> teams) {
        this.teams = teams;
    }

    public User withTeams(List<EntityReference> teams) {
        this.teams = teams;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("defaultPersona")
    public EntityReference getDefaultPersona() {
        return defaultPersona;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("defaultPersona")
    public void setDefaultPersona(EntityReference defaultPersona) {
        this.defaultPersona = defaultPersona;
    }

    public User withDefaultPersona(EntityReference defaultPersona) {
        this.defaultPersona = defaultPersona;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("personas")
    public List<EntityReference> getPersonas() {
        return personas;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("personas")
    public void setPersonas(List<EntityReference> personas) {
        this.personas = personas;
    }

    public User withPersonas(List<EntityReference> personas) {
        this.personas = personas;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("owns")
    public List<EntityReference> getOwns() {
        return owns;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("owns")
    public void setOwns(List<EntityReference> owns) {
        this.owns = owns;
    }

    public User withOwns(List<EntityReference> owns) {
        this.owns = owns;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("follows")
    public List<EntityReference> getFollows() {
        return follows;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("follows")
    public void setFollows(List<EntityReference> follows) {
        this.follows = follows;
    }

    public User withFollows(List<EntityReference> follows) {
        this.follows = follows;
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

    public User withChangeDescription(ChangeDescription changeDescription) {
        this.changeDescription = changeDescription;
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

    public User withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("roles")
    public List<EntityReference> getRoles() {
        return roles;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("roles")
    public void setRoles(List<EntityReference> roles) {
        this.roles = roles;
    }

    public User withRoles(List<EntityReference> roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("inheritedRoles")
    public List<EntityReference> getInheritedRoles() {
        return inheritedRoles;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("inheritedRoles")
    public void setInheritedRoles(List<EntityReference> inheritedRoles) {
        this.inheritedRoles = inheritedRoles;
    }

    public User withInheritedRoles(List<EntityReference> inheritedRoles) {
        this.inheritedRoles = inheritedRoles;
        return this;
    }

    /**
     * If the User has verified the mail
     * 
     */
    @JsonProperty("isEmailVerified")
    public Boolean getIsEmailVerified() {
        return isEmailVerified;
    }

    /**
     * If the User has verified the mail
     * 
     */
    @JsonProperty("isEmailVerified")
    public void setIsEmailVerified(Boolean isEmailVerified) {
        this.isEmailVerified = isEmailVerified;
    }

    public User withIsEmailVerified(Boolean isEmailVerified) {
        this.isEmailVerified = isEmailVerified;
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

    public User withDomain(EntityReference domain) {
        this.domain = domain;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(User.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
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
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
        sb.append(',');
        sb.append("timezone");
        sb.append('=');
        sb.append(((this.timezone == null)?"<null>":this.timezone));
        sb.append(',');
        sb.append("isBot");
        sb.append('=');
        sb.append(((this.isBot == null)?"<null>":this.isBot));
        sb.append(',');
        sb.append("isAdmin");
        sb.append('=');
        sb.append(((this.isAdmin == null)?"<null>":this.isAdmin));
        sb.append(',');
        sb.append("authenticationMechanism");
        sb.append('=');
        sb.append(((this.authenticationMechanism == null)?"<null>":this.authenticationMechanism));
        sb.append(',');
        sb.append("profile");
        sb.append('=');
        sb.append(((this.profile == null)?"<null>":this.profile));
        sb.append(',');
        sb.append("teams");
        sb.append('=');
        sb.append(((this.teams == null)?"<null>":this.teams));
        sb.append(',');
        sb.append("defaultPersona");
        sb.append('=');
        sb.append(((this.defaultPersona == null)?"<null>":this.defaultPersona));
        sb.append(',');
        sb.append("personas");
        sb.append('=');
        sb.append(((this.personas == null)?"<null>":this.personas));
        sb.append(',');
        sb.append("owns");
        sb.append('=');
        sb.append(((this.owns == null)?"<null>":this.owns));
        sb.append(',');
        sb.append("follows");
        sb.append('=');
        sb.append(((this.follows == null)?"<null>":this.follows));
        sb.append(',');
        sb.append("changeDescription");
        sb.append('=');
        sb.append(((this.changeDescription == null)?"<null>":this.changeDescription));
        sb.append(',');
        sb.append("deleted");
        sb.append('=');
        sb.append(((this.deleted == null)?"<null>":this.deleted));
        sb.append(',');
        sb.append("roles");
        sb.append('=');
        sb.append(((this.roles == null)?"<null>":this.roles));
        sb.append(',');
        sb.append("inheritedRoles");
        sb.append('=');
        sb.append(((this.inheritedRoles == null)?"<null>":this.inheritedRoles));
        sb.append(',');
        sb.append("isEmailVerified");
        sb.append('=');
        sb.append(((this.isEmailVerified == null)?"<null>":this.isEmailVerified));
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
        result = ((result* 31)+((this.isBot == null)? 0 :this.isBot.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.timezone == null)? 0 :this.timezone.hashCode()));
        result = ((result* 31)+((this.roles == null)? 0 :this.roles.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.isEmailVerified == null)? 0 :this.isEmailVerified.hashCode()));
        result = ((result* 31)+((this.owns == null)? 0 :this.owns.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.changeDescription == null)? 0 :this.changeDescription.hashCode()));
        result = ((result* 31)+((this.teams == null)? 0 :this.teams.hashCode()));
        result = ((result* 31)+((this.profile == null)? 0 :this.profile.hashCode()));
        result = ((result* 31)+((this.follows == null)? 0 :this.follows.hashCode()));
        result = ((result* 31)+((this.inheritedRoles == null)? 0 :this.inheritedRoles.hashCode()));
        result = ((result* 31)+((this.isAdmin == null)? 0 :this.isAdmin.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.personas == null)? 0 :this.personas.hashCode()));
        result = ((result* 31)+((this.defaultPersona == null)? 0 :this.defaultPersona.hashCode()));
        result = ((result* 31)+((this.deleted == null)? 0 :this.deleted.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.authenticationMechanism == null)? 0 :this.authenticationMechanism.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        User rhs = ((User) other);
        return (((((((((((((((((((((((((((this.isBot == rhs.isBot)||((this.isBot!= null)&&this.isBot.equals(rhs.isBot)))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.timezone == rhs.timezone)||((this.timezone!= null)&&this.timezone.equals(rhs.timezone))))&&((this.roles == rhs.roles)||((this.roles!= null)&&this.roles.equals(rhs.roles))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.isEmailVerified == rhs.isEmailVerified)||((this.isEmailVerified!= null)&&this.isEmailVerified.equals(rhs.isEmailVerified))))&&((this.owns == rhs.owns)||((this.owns!= null)&&this.owns.equals(rhs.owns))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.changeDescription == rhs.changeDescription)||((this.changeDescription!= null)&&this.changeDescription.equals(rhs.changeDescription))))&&((this.teams == rhs.teams)||((this.teams!= null)&&this.teams.equals(rhs.teams))))&&((this.profile == rhs.profile)||((this.profile!= null)&&this.profile.equals(rhs.profile))))&&((this.follows == rhs.follows)||((this.follows!= null)&&this.follows.equals(rhs.follows))))&&((this.inheritedRoles == rhs.inheritedRoles)||((this.inheritedRoles!= null)&&this.inheritedRoles.equals(rhs.inheritedRoles))))&&((this.isAdmin == rhs.isAdmin)||((this.isAdmin!= null)&&this.isAdmin.equals(rhs.isAdmin))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.personas == rhs.personas)||((this.personas!= null)&&this.personas.equals(rhs.personas))))&&((this.defaultPersona == rhs.defaultPersona)||((this.defaultPersona!= null)&&this.defaultPersona.equals(rhs.defaultPersona))))&&((this.deleted == rhs.deleted)||((this.deleted!= null)&&this.deleted.equals(rhs.deleted))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.authenticationMechanism == rhs.authenticationMechanism)||((this.authenticationMechanism!= null)&&this.authenticationMechanism.equals(rhs.authenticationMechanism))));
    }

}
