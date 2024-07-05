
package org.openmetadata.schema.api;

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
 * createBot
 * <p>
 * Create bot API request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "botUser",
    "description",
    "provider"
})
@Generated("jsonschema2pojo")
public class CreateBot implements CreateEntity
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
     * Name used for display purposes. Example 'FirstName LastName'.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Name used for display purposes. Example 'FirstName LastName'.")
    private String displayName;
    /**
     * Bot user name created for this bot on behalf of which the bot performs all the operations, such as updating description, responding on the conversation threads, etc.
     * (Required)
     * 
     */
    @JsonProperty("botUser")
    @JsonPropertyDescription("Bot user name created for this bot on behalf of which the bot performs all the operations, such as updating description, responding on the conversation threads, etc.")
    @NotNull
    private String botUser;
    /**
     * Description of the bot.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Description of the bot.")
    private String description;
    /**
     * Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.
     * 
     */
    @JsonProperty("provider")
    @JsonPropertyDescription("Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.")
    private ProviderType provider = ProviderType.fromValue("user");

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

    public CreateBot withName(String name) {
        this.name = name;
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

    public CreateBot withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Bot user name created for this bot on behalf of which the bot performs all the operations, such as updating description, responding on the conversation threads, etc.
     * (Required)
     * 
     */
    @JsonProperty("botUser")
    public String getBotUser() {
        return botUser;
    }

    /**
     * Bot user name created for this bot on behalf of which the bot performs all the operations, such as updating description, responding on the conversation threads, etc.
     * (Required)
     * 
     */
    @JsonProperty("botUser")
    public void setBotUser(String botUser) {
        this.botUser = botUser;
    }

    public CreateBot withBotUser(String botUser) {
        this.botUser = botUser;
        return this;
    }

    /**
     * Description of the bot.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description of the bot.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public CreateBot withDescription(String description) {
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

    public CreateBot withProvider(ProviderType provider) {
        this.provider = provider;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateBot.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("botUser");
        sb.append('=');
        sb.append(((this.botUser == null)?"<null>":this.botUser));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("provider");
        sb.append('=');
        sb.append(((this.provider == null)?"<null>":this.provider));
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
        result = ((result* 31)+((this.botUser == null)? 0 :this.botUser.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateBot) == false) {
            return false;
        }
        CreateBot rhs = ((CreateBot) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.botUser == rhs.botUser)||((this.botUser!= null)&&this.botUser.equals(rhs.botUser))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))));
    }

}
