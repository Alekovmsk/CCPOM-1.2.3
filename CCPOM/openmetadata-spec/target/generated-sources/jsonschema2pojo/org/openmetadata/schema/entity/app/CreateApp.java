
package org.openmetadata.schema.entity.app;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.CreateEntity;
import org.openmetadata.schema.type.EntityReference;


/**
 * CreateApp
 * <p>
 * This schema defines the create applications request for Open-Metadata.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "owner",
    "bot",
    "appConfiguration",
    "appSchedule"
})
@Generated("jsonschema2pojo")
public class CreateApp implements CreateEntity
{

    /**
     * Name that identifies an entity.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name that identifies an entity.")
    @Pattern(regexp = "^(?U)[\\w'\\- .&()%]+$")
    @Size(min = 1, max = 128)
    private String name;
    /**
     * Display Name for the application.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name for the application.")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
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
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("bot")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String bot;
    /**
     * Application Configuration object.
     * 
     */
    @JsonProperty("appConfiguration")
    @JsonPropertyDescription("Application Configuration object.")
    private Object appConfiguration;
    /**
     * This schema defines the type of application.
     * 
     */
    @JsonProperty("appSchedule")
    @JsonPropertyDescription("This schema defines the type of application.")
    private AppSchedule appSchedule;

    /**
     * Name that identifies an entity.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name that identifies an entity.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CreateApp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name for the application.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name for the application.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateApp withDisplayName(String displayName) {
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

    public CreateApp withDescription(String description) {
        this.description = description;
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

    public CreateApp withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("bot")
    public String getBot() {
        return bot;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("bot")
    public void setBot(String bot) {
        this.bot = bot;
    }

    public CreateApp withBot(String bot) {
        this.bot = bot;
        return this;
    }

    /**
     * Application Configuration object.
     * 
     */
    @JsonProperty("appConfiguration")
    public Object getAppConfiguration() {
        return appConfiguration;
    }

    /**
     * Application Configuration object.
     * 
     */
    @JsonProperty("appConfiguration")
    public void setAppConfiguration(Object appConfiguration) {
        this.appConfiguration = appConfiguration;
    }

    public CreateApp withAppConfiguration(Object appConfiguration) {
        this.appConfiguration = appConfiguration;
        return this;
    }

    /**
     * This schema defines the type of application.
     * 
     */
    @JsonProperty("appSchedule")
    public AppSchedule getAppSchedule() {
        return appSchedule;
    }

    /**
     * This schema defines the type of application.
     * 
     */
    @JsonProperty("appSchedule")
    public void setAppSchedule(AppSchedule appSchedule) {
        this.appSchedule = appSchedule;
    }

    public CreateApp withAppSchedule(AppSchedule appSchedule) {
        this.appSchedule = appSchedule;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateApp.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("bot");
        sb.append('=');
        sb.append(((this.bot == null)?"<null>":this.bot));
        sb.append(',');
        sb.append("appConfiguration");
        sb.append('=');
        sb.append(((this.appConfiguration == null)?"<null>":this.appConfiguration));
        sb.append(',');
        sb.append("appSchedule");
        sb.append('=');
        sb.append(((this.appSchedule == null)?"<null>":this.appSchedule));
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
        result = ((result* 31)+((this.appSchedule == null)? 0 :this.appSchedule.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.bot == null)? 0 :this.bot.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.appConfiguration == null)? 0 :this.appConfiguration.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateApp) == false) {
            return false;
        }
        CreateApp rhs = ((CreateApp) other);
        return ((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.appSchedule == rhs.appSchedule)||((this.appSchedule!= null)&&this.appSchedule.equals(rhs.appSchedule))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.bot == rhs.bot)||((this.bot!= null)&&this.bot.equals(rhs.bot))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.appConfiguration == rhs.appConfiguration)||((this.appConfiguration!= null)&&this.appConfiguration.equals(rhs.appConfiguration))));
    }

}
