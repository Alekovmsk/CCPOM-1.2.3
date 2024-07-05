
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
import org.openmetadata.schema.entity.teams.AuthenticationMechanism;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.Profile;


/**
 * CreateUserRequest
 * <p>
 * Request to create User entity
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "description",
    "displayName",
    "email",
    "timezone",
    "isBot",
    "botName",
    "isAdmin",
    "profile",
    "teams",
    "roles",
    "personas",
    "defaultPersona",
    "authenticationMechanism",
    "createPasswordType",
    "password",
    "confirmPassword"
})
@Generated("jsonschema2pojo")
public class CreateUser implements CreateEntity
{

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
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * Name used for display purposes. Example 'FirstName LastName'
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Name used for display purposes. Example 'FirstName LastName'")
    private String displayName;
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
     * Timezone of the user
     * 
     */
    @JsonProperty("timezone")
    @JsonPropertyDescription("Timezone of the user")
    private String timezone;
    /**
     * When true indicates user is a bot with appropriate privileges
     * 
     */
    @JsonProperty("isBot")
    @JsonPropertyDescription("When true indicates user is a bot with appropriate privileges")
    private Boolean isBot;
    /**
     * User bot name if we want to associate this bot with an specific bot
     * 
     */
    @JsonProperty("botName")
    @JsonPropertyDescription("User bot name if we want to associate this bot with an specific bot")
    private String botName;
    /**
     * When true indicates user is an administrator for the system with superuser privileges
     * 
     */
    @JsonProperty("isAdmin")
    @JsonPropertyDescription("When true indicates user is an administrator for the system with superuser privileges")
    private Boolean isAdmin = false;
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
     * Teams that the user belongs to
     * 
     */
    @JsonProperty("teams")
    @JsonPropertyDescription("Teams that the user belongs to")
    @Valid
    private List<UUID> teams = null;
    /**
     * Roles that the user has been assigned
     * 
     */
    @JsonProperty("roles")
    @JsonPropertyDescription("Roles that the user has been assigned")
    @Valid
    private List<UUID> roles = null;
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
     * User/Bot Authentication Mechanism.
     * 
     */
    @JsonProperty("authenticationMechanism")
    @JsonPropertyDescription("User/Bot Authentication Mechanism.")
    @Valid
    private AuthenticationMechanism authenticationMechanism;
    /**
     * User Password Method
     * 
     */
    @JsonProperty("createPasswordType")
    @JsonPropertyDescription("User Password Method")
    private CreateUser.CreatePasswordType createPasswordType = CreateUser.CreatePasswordType.fromValue("USER_CREATE");
    /**
     * Password for User
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("Password for User")
    private String password;
    /**
     * Confirm Password for User
     * 
     */
    @JsonProperty("confirmPassword")
    @JsonPropertyDescription("Confirm Password for User")
    private String confirmPassword;

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

    public CreateUser withName(String name) {
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

    public CreateUser withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Name used for display purposes. Example 'FirstName LastName'
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Name used for display purposes. Example 'FirstName LastName'
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateUser withDisplayName(String displayName) {
        this.displayName = displayName;
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

    public CreateUser withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Timezone of the user
     * 
     */
    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    /**
     * Timezone of the user
     * 
     */
    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public CreateUser withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * When true indicates user is a bot with appropriate privileges
     * 
     */
    @JsonProperty("isBot")
    public Boolean getIsBot() {
        return isBot;
    }

    /**
     * When true indicates user is a bot with appropriate privileges
     * 
     */
    @JsonProperty("isBot")
    public void setIsBot(Boolean isBot) {
        this.isBot = isBot;
    }

    public CreateUser withIsBot(Boolean isBot) {
        this.isBot = isBot;
        return this;
    }

    /**
     * User bot name if we want to associate this bot with an specific bot
     * 
     */
    @JsonProperty("botName")
    public String getBotName() {
        return botName;
    }

    /**
     * User bot name if we want to associate this bot with an specific bot
     * 
     */
    @JsonProperty("botName")
    public void setBotName(String botName) {
        this.botName = botName;
    }

    public CreateUser withBotName(String botName) {
        this.botName = botName;
        return this;
    }

    /**
     * When true indicates user is an administrator for the system with superuser privileges
     * 
     */
    @JsonProperty("isAdmin")
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    /**
     * When true indicates user is an administrator for the system with superuser privileges
     * 
     */
    @JsonProperty("isAdmin")
    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public CreateUser withIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
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

    public CreateUser withProfile(Profile profile) {
        this.profile = profile;
        return this;
    }

    /**
     * Teams that the user belongs to
     * 
     */
    @JsonProperty("teams")
    public List<UUID> getTeams() {
        return teams;
    }

    /**
     * Teams that the user belongs to
     * 
     */
    @JsonProperty("teams")
    public void setTeams(List<UUID> teams) {
        this.teams = teams;
    }

    public CreateUser withTeams(List<UUID> teams) {
        this.teams = teams;
        return this;
    }

    /**
     * Roles that the user has been assigned
     * 
     */
    @JsonProperty("roles")
    public List<UUID> getRoles() {
        return roles;
    }

    /**
     * Roles that the user has been assigned
     * 
     */
    @JsonProperty("roles")
    public void setRoles(List<UUID> roles) {
        this.roles = roles;
    }

    public CreateUser withRoles(List<UUID> roles) {
        this.roles = roles;
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

    public CreateUser withPersonas(List<EntityReference> personas) {
        this.personas = personas;
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

    public CreateUser withDefaultPersona(EntityReference defaultPersona) {
        this.defaultPersona = defaultPersona;
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

    public CreateUser withAuthenticationMechanism(AuthenticationMechanism authenticationMechanism) {
        this.authenticationMechanism = authenticationMechanism;
        return this;
    }

    /**
     * User Password Method
     * 
     */
    @JsonProperty("createPasswordType")
    public CreateUser.CreatePasswordType getCreatePasswordType() {
        return createPasswordType;
    }

    /**
     * User Password Method
     * 
     */
    @JsonProperty("createPasswordType")
    public void setCreatePasswordType(CreateUser.CreatePasswordType createPasswordType) {
        this.createPasswordType = createPasswordType;
    }

    public CreateUser withCreatePasswordType(CreateUser.CreatePasswordType createPasswordType) {
        this.createPasswordType = createPasswordType;
        return this;
    }

    /**
     * Password for User
     * 
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     * Password for User
     * 
     */
    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    public CreateUser withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Confirm Password for User
     * 
     */
    @JsonProperty("confirmPassword")
    public String getConfirmPassword() {
        return confirmPassword;
    }

    /**
     * Confirm Password for User
     * 
     */
    @JsonProperty("confirmPassword")
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public CreateUser withConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateUser.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("timezone");
        sb.append('=');
        sb.append(((this.timezone == null)?"<null>":this.timezone));
        sb.append(',');
        sb.append("isBot");
        sb.append('=');
        sb.append(((this.isBot == null)?"<null>":this.isBot));
        sb.append(',');
        sb.append("botName");
        sb.append('=');
        sb.append(((this.botName == null)?"<null>":this.botName));
        sb.append(',');
        sb.append("isAdmin");
        sb.append('=');
        sb.append(((this.isAdmin == null)?"<null>":this.isAdmin));
        sb.append(',');
        sb.append("profile");
        sb.append('=');
        sb.append(((this.profile == null)?"<null>":this.profile));
        sb.append(',');
        sb.append("teams");
        sb.append('=');
        sb.append(((this.teams == null)?"<null>":this.teams));
        sb.append(',');
        sb.append("roles");
        sb.append('=');
        sb.append(((this.roles == null)?"<null>":this.roles));
        sb.append(',');
        sb.append("personas");
        sb.append('=');
        sb.append(((this.personas == null)?"<null>":this.personas));
        sb.append(',');
        sb.append("defaultPersona");
        sb.append('=');
        sb.append(((this.defaultPersona == null)?"<null>":this.defaultPersona));
        sb.append(',');
        sb.append("authenticationMechanism");
        sb.append('=');
        sb.append(((this.authenticationMechanism == null)?"<null>":this.authenticationMechanism));
        sb.append(',');
        sb.append("createPasswordType");
        sb.append('=');
        sb.append(((this.createPasswordType == null)?"<null>":this.createPasswordType));
        sb.append(',');
        sb.append("password");
        sb.append('=');
        sb.append(((this.password == null)?"<null>":this.password));
        sb.append(',');
        sb.append("confirmPassword");
        sb.append('=');
        sb.append(((this.confirmPassword == null)?"<null>":this.confirmPassword));
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
        result = ((result* 31)+((this.teams == null)? 0 :this.teams.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.timezone == null)? 0 :this.timezone.hashCode()));
        result = ((result* 31)+((this.botName == null)? 0 :this.botName.hashCode()));
        result = ((result* 31)+((this.profile == null)? 0 :this.profile.hashCode()));
        result = ((result* 31)+((this.roles == null)? 0 :this.roles.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.isAdmin == null)? 0 :this.isAdmin.hashCode()));
        result = ((result* 31)+((this.personas == null)? 0 :this.personas.hashCode()));
        result = ((result* 31)+((this.defaultPersona == null)? 0 :this.defaultPersona.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.createPasswordType == null)? 0 :this.createPasswordType.hashCode()));
        result = ((result* 31)+((this.confirmPassword == null)? 0 :this.confirmPassword.hashCode()));
        result = ((result* 31)+((this.authenticationMechanism == null)? 0 :this.authenticationMechanism.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateUser) == false) {
            return false;
        }
        CreateUser rhs = ((CreateUser) other);
        return ((((((((((((((((((this.isBot == rhs.isBot)||((this.isBot!= null)&&this.isBot.equals(rhs.isBot)))&&((this.teams == rhs.teams)||((this.teams!= null)&&this.teams.equals(rhs.teams))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.timezone == rhs.timezone)||((this.timezone!= null)&&this.timezone.equals(rhs.timezone))))&&((this.botName == rhs.botName)||((this.botName!= null)&&this.botName.equals(rhs.botName))))&&((this.profile == rhs.profile)||((this.profile!= null)&&this.profile.equals(rhs.profile))))&&((this.roles == rhs.roles)||((this.roles!= null)&&this.roles.equals(rhs.roles))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.isAdmin == rhs.isAdmin)||((this.isAdmin!= null)&&this.isAdmin.equals(rhs.isAdmin))))&&((this.personas == rhs.personas)||((this.personas!= null)&&this.personas.equals(rhs.personas))))&&((this.defaultPersona == rhs.defaultPersona)||((this.defaultPersona!= null)&&this.defaultPersona.equals(rhs.defaultPersona))))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.createPasswordType == rhs.createPasswordType)||((this.createPasswordType!= null)&&this.createPasswordType.equals(rhs.createPasswordType))))&&((this.confirmPassword == rhs.confirmPassword)||((this.confirmPassword!= null)&&this.confirmPassword.equals(rhs.confirmPassword))))&&((this.authenticationMechanism == rhs.authenticationMechanism)||((this.authenticationMechanism!= null)&&this.authenticationMechanism.equals(rhs.authenticationMechanism))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }


    /**
     * User Password Method
     * 
     */
    @Generated("jsonschema2pojo")
    public enum CreatePasswordType {

        ADMIN_CREATE("ADMIN_CREATE"),
        USER_CREATE("USER_CREATE");
        private final String value;
        private final static Map<String, CreateUser.CreatePasswordType> CONSTANTS = new HashMap<String, CreateUser.CreatePasswordType>();

        static {
            for (CreateUser.CreatePasswordType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CreatePasswordType(String value) {
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
        public static CreateUser.CreatePasswordType fromValue(String value) {
            CreateUser.CreatePasswordType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
