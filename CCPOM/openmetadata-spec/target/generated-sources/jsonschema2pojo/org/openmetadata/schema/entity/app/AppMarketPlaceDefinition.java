
package org.openmetadata.schema.entity.app;

import java.net.URI;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadata.schema.EntityInterface;
import org.openmetadata.schema.type.ChangeDescription;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.TagLabel;


/**
 * AppMarketPlaceDefinition
 * <p>
 * This schema defines the applications for Open-Metadata.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "displayName",
    "description",
    "features",
    "fullyQualifiedName",
    "owner",
    "version",
    "updatedAt",
    "updatedBy",
    "href",
    "changeDescription",
    "deleted",
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
public class AppMarketPlaceDefinition implements EntityInterface
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
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String fullyQualifiedName;
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
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    @JsonPropertyDescription("URI that points to a resource.")
    private URI href;
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

    public AppMarketPlaceDefinition withId(UUID id) {
        this.id = id;
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

    public AppMarketPlaceDefinition withName(String name) {
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

    public AppMarketPlaceDefinition withDisplayName(String displayName) {
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

    public AppMarketPlaceDefinition withDescription(String description) {
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

    public AppMarketPlaceDefinition withFeatures(String features) {
        this.features = features;
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

    public AppMarketPlaceDefinition withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
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

    public AppMarketPlaceDefinition withOwner(EntityReference owner) {
        this.owner = owner;
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

    public AppMarketPlaceDefinition withVersion(Double version) {
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

    public AppMarketPlaceDefinition withUpdatedAt(Long updatedAt) {
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

    public AppMarketPlaceDefinition withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
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

    public AppMarketPlaceDefinition withHref(URI href) {
        this.href = href;
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

    public AppMarketPlaceDefinition withChangeDescription(ChangeDescription changeDescription) {
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

    public AppMarketPlaceDefinition withDeleted(Boolean deleted) {
        this.deleted = deleted;
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

    public AppMarketPlaceDefinition withTags(List<TagLabel> tags) {
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

    public AppMarketPlaceDefinition withDeveloper(String developer) {
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

    public AppMarketPlaceDefinition withDeveloperUrl(String developerUrl) {
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

    public AppMarketPlaceDefinition withPrivacyPolicyUrl(String privacyPolicyUrl) {
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

    public AppMarketPlaceDefinition withSupportEmail(String supportEmail) {
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

    public AppMarketPlaceDefinition withClassName(String className) {
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

    public AppMarketPlaceDefinition withAppType(AppType appType) {
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

    public AppMarketPlaceDefinition withScheduleType(ScheduleType scheduleType) {
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

    public AppMarketPlaceDefinition withPermission(NativeAppPermission permission) {
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

    public AppMarketPlaceDefinition withRuntime(Object runtime) {
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

    public AppMarketPlaceDefinition withAppConfiguration(Object appConfiguration) {
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

    public AppMarketPlaceDefinition withAppLogoUrl(URI appLogoUrl) {
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

    public AppMarketPlaceDefinition withAppScreenshots(Set<String> appScreenshots) {
        this.appScreenshots = appScreenshots;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AppMarketPlaceDefinition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        sb.append("features");
        sb.append('=');
        sb.append(((this.features == null)?"<null>":this.features));
        sb.append(',');
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
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
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
        sb.append(',');
        sb.append("changeDescription");
        sb.append('=');
        sb.append(((this.changeDescription == null)?"<null>":this.changeDescription));
        sb.append(',');
        sb.append("deleted");
        sb.append('=');
        sb.append(((this.deleted == null)?"<null>":this.deleted));
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
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.appLogoUrl == null)? 0 :this.appLogoUrl.hashCode()));
        result = ((result* 31)+((this.className == null)? 0 :this.className.hashCode()));
        result = ((result* 31)+((this.appConfiguration == null)? 0 :this.appConfiguration.hashCode()));
        result = ((result* 31)+((this.features == null)? 0 :this.features.hashCode()));
        result = ((result* 31)+((this.appType == null)? 0 :this.appType.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.changeDescription == null)? 0 :this.changeDescription.hashCode()));
        result = ((result* 31)+((this.runtime == null)? 0 :this.runtime.hashCode()));
        result = ((result* 31)+((this.permission == null)? 0 :this.permission.hashCode()));
        result = ((result* 31)+((this.developerUrl == null)? 0 :this.developerUrl.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.privacyPolicyUrl == null)? 0 :this.privacyPolicyUrl.hashCode()));
        result = ((result* 31)+((this.appScreenshots == null)? 0 :this.appScreenshots.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.supportEmail == null)? 0 :this.supportEmail.hashCode()));
        result = ((result* 31)+((this.deleted == null)? 0 :this.deleted.hashCode()));
        result = ((result* 31)+((this.scheduleType == null)? 0 :this.scheduleType.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.developer == null)? 0 :this.developer.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppMarketPlaceDefinition) == false) {
            return false;
        }
        AppMarketPlaceDefinition rhs = ((AppMarketPlaceDefinition) other);
        return (((((((((((((((((((((((((((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.appLogoUrl == rhs.appLogoUrl)||((this.appLogoUrl!= null)&&this.appLogoUrl.equals(rhs.appLogoUrl))))&&((this.className == rhs.className)||((this.className!= null)&&this.className.equals(rhs.className))))&&((this.appConfiguration == rhs.appConfiguration)||((this.appConfiguration!= null)&&this.appConfiguration.equals(rhs.appConfiguration))))&&((this.features == rhs.features)||((this.features!= null)&&this.features.equals(rhs.features))))&&((this.appType == rhs.appType)||((this.appType!= null)&&this.appType.equals(rhs.appType))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.changeDescription == rhs.changeDescription)||((this.changeDescription!= null)&&this.changeDescription.equals(rhs.changeDescription))))&&((this.runtime == rhs.runtime)||((this.runtime!= null)&&this.runtime.equals(rhs.runtime))))&&((this.permission == rhs.permission)||((this.permission!= null)&&this.permission.equals(rhs.permission))))&&((this.developerUrl == rhs.developerUrl)||((this.developerUrl!= null)&&this.developerUrl.equals(rhs.developerUrl))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.privacyPolicyUrl == rhs.privacyPolicyUrl)||((this.privacyPolicyUrl!= null)&&this.privacyPolicyUrl.equals(rhs.privacyPolicyUrl))))&&((this.appScreenshots == rhs.appScreenshots)||((this.appScreenshots!= null)&&this.appScreenshots.equals(rhs.appScreenshots))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.supportEmail == rhs.supportEmail)||((this.supportEmail!= null)&&this.supportEmail.equals(rhs.supportEmail))))&&((this.deleted == rhs.deleted)||((this.deleted!= null)&&this.deleted.equals(rhs.deleted))))&&((this.scheduleType == rhs.scheduleType)||((this.scheduleType!= null)&&this.scheduleType.equals(rhs.scheduleType))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.developer == rhs.developer)||((this.developer!= null)&&this.developer.equals(rhs.developer))));
    }

}
