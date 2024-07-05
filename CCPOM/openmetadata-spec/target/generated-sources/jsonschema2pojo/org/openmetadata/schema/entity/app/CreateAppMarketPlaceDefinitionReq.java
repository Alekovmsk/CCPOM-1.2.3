
package org.openmetadata.schema.entity.app;

import java.net.URI;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadata.schema.CreateEntity;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.TagLabel;


/**
 * CreateAppMarketPlaceDefinitionReq
 * <p>
 * This schema defines the applications for Open-Metadata.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "features",
    "owner",
    "tags",
    "developer",
    "developerUrl",
    "privacyPolicyUrl",
    "supportEmail",
    "className",
    "appType",
    "scheduleType",
    "permission",
    "runtime",
    "appConfiguration",
    "appLogoUrl",
    "appScreenshots"
})
@Generated("jsonschema2pojo")
public class CreateAppMarketPlaceDefinitionReq implements CreateEntity
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
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("features")
    @JsonPropertyDescription("Text in Markdown format.")
    private String features;
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
     * Tags associated with the entity.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags associated with the entity.")
    @Valid
    private List<TagLabel> tags = null;
    /**
     * Developer For the Application.
     * 
     */
    @JsonProperty("developer")
    @JsonPropertyDescription("Developer For the Application.")
    private String developer;
    /**
     * Url for the developer
     * 
     */
    @JsonProperty("developerUrl")
    @JsonPropertyDescription("Url for the developer")
    private String developerUrl;
    /**
     * Privacy Policy for the developer
     * 
     */
    @JsonProperty("privacyPolicyUrl")
    @JsonPropertyDescription("Privacy Policy for the developer")
    private String privacyPolicyUrl;
    /**
     * Support Email for the application
     * 
     */
    @JsonProperty("supportEmail")
    @JsonPropertyDescription("Support Email for the application")
    private String supportEmail;
    /**
     * Full Qualified ClassName for the the application
     * (Required)
     * 
     */
    @JsonProperty("className")
    @JsonPropertyDescription("Full Qualified ClassName for the the application")
    @NotNull
    private String className;
    /**
     * This schema defines the type of application.
     * (Required)
     * 
     */
    @JsonProperty("appType")
    @JsonPropertyDescription("This schema defines the type of application.")
    @NotNull
    private AppType appType;
    /**
     * This schema defines the type of application.
     * (Required)
     * 
     */
    @JsonProperty("scheduleType")
    @JsonPropertyDescription("This schema defines the type of application.")
    @NotNull
    private ScheduleType scheduleType;
    /**
     * This schema defines the Permission used by Native Application.
     * (Required)
     * 
     */
    @JsonProperty("permission")
    @JsonPropertyDescription("This schema defines the Permission used by Native Application.")
    @NotNull
    private NativeAppPermission permission;
    /**
     * Execution Configuration.
     * 
     */
    @JsonProperty("runtime")
    @JsonPropertyDescription("Execution Configuration.")
    private Object runtime;
    /**
     * Application Configuration object.
     * 
     */
    @JsonProperty("appConfiguration")
    @JsonPropertyDescription("Application Configuration object.")
    private Object appConfiguration;
    /**
     * Application Logo Url.
     * 
     */
    @JsonProperty("appLogoUrl")
    @JsonPropertyDescription("Application Logo Url.")
    private URI appLogoUrl;
    /**
     * Application Screenshots.
     * 
     */
    @JsonProperty("appScreenshots")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Application Screenshots.")
    @Valid
    private Set<String> appScreenshots = new LinkedHashSet<String>();

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

    public CreateAppMarketPlaceDefinitionReq withName(String name) {
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

    public CreateAppMarketPlaceDefinitionReq withDisplayName(String displayName) {
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

    public CreateAppMarketPlaceDefinitionReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("features")
    public String getFeatures() {
        return features;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("features")
    public void setFeatures(String features) {
        this.features = features;
    }

    public CreateAppMarketPlaceDefinitionReq withFeatures(String features) {
        this.features = features;
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

    public CreateAppMarketPlaceDefinitionReq withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Tags associated with the entity.
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags associated with the entity.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public CreateAppMarketPlaceDefinitionReq withTags(List<TagLabel> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Developer For the Application.
     * 
     */
    @JsonProperty("developer")
    public String getDeveloper() {
        return developer;
    }

    /**
     * Developer For the Application.
     * 
     */
    @JsonProperty("developer")
    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public CreateAppMarketPlaceDefinitionReq withDeveloper(String developer) {
        this.developer = developer;
        return this;
    }

    /**
     * Url for the developer
     * 
     */
    @JsonProperty("developerUrl")
    public String getDeveloperUrl() {
        return developerUrl;
    }

    /**
     * Url for the developer
     * 
     */
    @JsonProperty("developerUrl")
    public void setDeveloperUrl(String developerUrl) {
        this.developerUrl = developerUrl;
    }

    public CreateAppMarketPlaceDefinitionReq withDeveloperUrl(String developerUrl) {
        this.developerUrl = developerUrl;
        return this;
    }

    /**
     * Privacy Policy for the developer
     * 
     */
    @JsonProperty("privacyPolicyUrl")
    public String getPrivacyPolicyUrl() {
        return privacyPolicyUrl;
    }

    /**
     * Privacy Policy for the developer
     * 
     */
    @JsonProperty("privacyPolicyUrl")
    public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
    }

    public CreateAppMarketPlaceDefinitionReq withPrivacyPolicyUrl(String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
        return this;
    }

    /**
     * Support Email for the application
     * 
     */
    @JsonProperty("supportEmail")
    public String getSupportEmail() {
        return supportEmail;
    }

    /**
     * Support Email for the application
     * 
     */
    @JsonProperty("supportEmail")
    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    public CreateAppMarketPlaceDefinitionReq withSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
        return this;
    }

    /**
     * Full Qualified ClassName for the the application
     * (Required)
     * 
     */
    @JsonProperty("className")
    public String getClassName() {
        return className;
    }

    /**
     * Full Qualified ClassName for the the application
     * (Required)
     * 
     */
    @JsonProperty("className")
    public void setClassName(String className) {
        this.className = className;
    }

    public CreateAppMarketPlaceDefinitionReq withClassName(String className) {
        this.className = className;
        return this;
    }

    /**
     * This schema defines the type of application.
     * (Required)
     * 
     */
    @JsonProperty("appType")
    public AppType getAppType() {
        return appType;
    }

    /**
     * This schema defines the type of application.
     * (Required)
     * 
     */
    @JsonProperty("appType")
    public void setAppType(AppType appType) {
        this.appType = appType;
    }

    public CreateAppMarketPlaceDefinitionReq withAppType(AppType appType) {
        this.appType = appType;
        return this;
    }

    /**
     * This schema defines the type of application.
     * (Required)
     * 
     */
    @JsonProperty("scheduleType")
    public ScheduleType getScheduleType() {
        return scheduleType;
    }

    /**
     * This schema defines the type of application.
     * (Required)
     * 
     */
    @JsonProperty("scheduleType")
    public void setScheduleType(ScheduleType scheduleType) {
        this.scheduleType = scheduleType;
    }

    public CreateAppMarketPlaceDefinitionReq withScheduleType(ScheduleType scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }

    /**
     * This schema defines the Permission used by Native Application.
     * (Required)
     * 
     */
    @JsonProperty("permission")
    public NativeAppPermission getPermission() {
        return permission;
    }

    /**
     * This schema defines the Permission used by Native Application.
     * (Required)
     * 
     */
    @JsonProperty("permission")
    public void setPermission(NativeAppPermission permission) {
        this.permission = permission;
    }

    public CreateAppMarketPlaceDefinitionReq withPermission(NativeAppPermission permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Execution Configuration.
     * 
     */
    @JsonProperty("runtime")
    public Object getRuntime() {
        return runtime;
    }

    /**
     * Execution Configuration.
     * 
     */
    @JsonProperty("runtime")
    public void setRuntime(Object runtime) {
        this.runtime = runtime;
    }

    public CreateAppMarketPlaceDefinitionReq withRuntime(Object runtime) {
        this.runtime = runtime;
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

    public CreateAppMarketPlaceDefinitionReq withAppConfiguration(Object appConfiguration) {
        this.appConfiguration = appConfiguration;
        return this;
    }

    /**
     * Application Logo Url.
     * 
     */
    @JsonProperty("appLogoUrl")
    public URI getAppLogoUrl() {
        return appLogoUrl;
    }

    /**
     * Application Logo Url.
     * 
     */
    @JsonProperty("appLogoUrl")
    public void setAppLogoUrl(URI appLogoUrl) {
        this.appLogoUrl = appLogoUrl;
    }

    public CreateAppMarketPlaceDefinitionReq withAppLogoUrl(URI appLogoUrl) {
        this.appLogoUrl = appLogoUrl;
        return this;
    }

    /**
     * Application Screenshots.
     * 
     */
    @JsonProperty("appScreenshots")
    public Set<String> getAppScreenshots() {
        return appScreenshots;
    }

    /**
     * Application Screenshots.
     * 
     */
    @JsonProperty("appScreenshots")
    public void setAppScreenshots(Set<String> appScreenshots) {
        this.appScreenshots = appScreenshots;
    }

    public CreateAppMarketPlaceDefinitionReq withAppScreenshots(Set<String> appScreenshots) {
        this.appScreenshots = appScreenshots;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateAppMarketPlaceDefinitionReq.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("features");
        sb.append('=');
        sb.append(((this.features == null)?"<null>":this.features));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("developer");
        sb.append('=');
        sb.append(((this.developer == null)?"<null>":this.developer));
        sb.append(',');
        sb.append("developerUrl");
        sb.append('=');
        sb.append(((this.developerUrl == null)?"<null>":this.developerUrl));
        sb.append(',');
        sb.append("privacyPolicyUrl");
        sb.append('=');
        sb.append(((this.privacyPolicyUrl == null)?"<null>":this.privacyPolicyUrl));
        sb.append(',');
        sb.append("supportEmail");
        sb.append('=');
        sb.append(((this.supportEmail == null)?"<null>":this.supportEmail));
        sb.append(',');
        sb.append("className");
        sb.append('=');
        sb.append(((this.className == null)?"<null>":this.className));
        sb.append(',');
        sb.append("appType");
        sb.append('=');
        sb.append(((this.appType == null)?"<null>":this.appType));
        sb.append(',');
        sb.append("scheduleType");
        sb.append('=');
        sb.append(((this.scheduleType == null)?"<null>":this.scheduleType));
        sb.append(',');
        sb.append("permission");
        sb.append('=');
        sb.append(((this.permission == null)?"<null>":this.permission));
        sb.append(',');
        sb.append("runtime");
        sb.append('=');
        sb.append(((this.runtime == null)?"<null>":this.runtime));
        sb.append(',');
        sb.append("appConfiguration");
        sb.append('=');
        sb.append(((this.appConfiguration == null)?"<null>":this.appConfiguration));
        sb.append(',');
        sb.append("appLogoUrl");
        sb.append('=');
        sb.append(((this.appLogoUrl == null)?"<null>":this.appLogoUrl));
        sb.append(',');
        sb.append("appScreenshots");
        sb.append('=');
        sb.append(((this.appScreenshots == null)?"<null>":this.appScreenshots));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.runtime == null)? 0 :this.runtime.hashCode()));
        result = ((result* 31)+((this.appLogoUrl == null)? 0 :this.appLogoUrl.hashCode()));
        result = ((result* 31)+((this.className == null)? 0 :this.className.hashCode()));
        result = ((result* 31)+((this.permission == null)? 0 :this.permission.hashCode()));
        result = ((result* 31)+((this.developerUrl == null)? 0 :this.developerUrl.hashCode()));
        result = ((result* 31)+((this.appConfiguration == null)? 0 :this.appConfiguration.hashCode()));
        result = ((result* 31)+((this.privacyPolicyUrl == null)? 0 :this.privacyPolicyUrl.hashCode()));
        result = ((result* 31)+((this.appScreenshots == null)? 0 :this.appScreenshots.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.features == null)? 0 :this.features.hashCode()));
        result = ((result* 31)+((this.supportEmail == null)? 0 :this.supportEmail.hashCode()));
        result = ((result* 31)+((this.scheduleType == null)? 0 :this.scheduleType.hashCode()));
        result = ((result* 31)+((this.appType == null)? 0 :this.appType.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.developer == null)? 0 :this.developer.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateAppMarketPlaceDefinitionReq) == false) {
            return false;
        }
        CreateAppMarketPlaceDefinitionReq rhs = ((CreateAppMarketPlaceDefinitionReq) other);
        return (((((((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.runtime == rhs.runtime)||((this.runtime!= null)&&this.runtime.equals(rhs.runtime))))&&((this.appLogoUrl == rhs.appLogoUrl)||((this.appLogoUrl!= null)&&this.appLogoUrl.equals(rhs.appLogoUrl))))&&((this.className == rhs.className)||((this.className!= null)&&this.className.equals(rhs.className))))&&((this.permission == rhs.permission)||((this.permission!= null)&&this.permission.equals(rhs.permission))))&&((this.developerUrl == rhs.developerUrl)||((this.developerUrl!= null)&&this.developerUrl.equals(rhs.developerUrl))))&&((this.appConfiguration == rhs.appConfiguration)||((this.appConfiguration!= null)&&this.appConfiguration.equals(rhs.appConfiguration))))&&((this.privacyPolicyUrl == rhs.privacyPolicyUrl)||((this.privacyPolicyUrl!= null)&&this.privacyPolicyUrl.equals(rhs.privacyPolicyUrl))))&&((this.appScreenshots == rhs.appScreenshots)||((this.appScreenshots!= null)&&this.appScreenshots.equals(rhs.appScreenshots))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.features == rhs.features)||((this.features!= null)&&this.features.equals(rhs.features))))&&((this.supportEmail == rhs.supportEmail)||((this.supportEmail!= null)&&this.supportEmail.equals(rhs.supportEmail))))&&((this.scheduleType == rhs.scheduleType)||((this.scheduleType!= null)&&this.scheduleType.equals(rhs.scheduleType))))&&((this.appType == rhs.appType)||((this.appType!= null)&&this.appType.equals(rhs.appType))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.developer == rhs.developer)||((this.developer!= null)&&this.developer.equals(rhs.developer))));
    }

}
