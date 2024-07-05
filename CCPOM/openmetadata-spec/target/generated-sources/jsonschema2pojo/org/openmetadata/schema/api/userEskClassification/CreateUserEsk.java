
package org.openmetadata.schema.api.userEskClassification;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.CreateEntity;
import org.openmetadata.schema.entity.type.Style;
import org.openmetadata.schema.type.ProviderType;


/**
 * CreateUserEskRequest
 * <p>
 * Create userEsk API request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "userEskClassification",
    "parent",
    "name",
    "displayName",
    "description",
    "lastName",
    "firstName",
    "middleName",
    "email",
    "userName",
    "fullName",
    "phoneNumber",
    "jobTitle",
    "department",
    "isActive",
    "createTimestamp",
    "modifyTimestamp",
    "style",
    "associatedUserEsks",
    "provider",
    "mutuallyExclusive"
})
@Generated("jsonschema2pojo")
public class CreateUserEsk implements CreateEntity
{

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("userEskClassification")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String userEskClassification;
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("parent")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String parent;
    /**
     * Name of the userEsk.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the userEsk.")
    @Pattern(regexp = "^(?U)[\\w'\\- .&()]+$")
    @Size(min = 2, max = 64)
    @NotNull
    private String name;
    /**
     * Display Name that identifies this userEsk.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this userEsk.")
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
     * last name
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("last name")
    private String lastName;
    /**
     * first name
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("first name")
    private String firstName;
    /**
     * middle name
     * 
     */
    @JsonProperty("middleName")
    @JsonPropertyDescription("middle name")
    private String middleName;
    /**
     * user email
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("user email")
    private String email;
    /**
     * user name
     * 
     */
    @JsonProperty("userName")
    @JsonPropertyDescription("user name")
    private String userName;
    /**
     * full name
     * 
     */
    @JsonProperty("fullName")
    @JsonPropertyDescription("full name")
    private String fullName;
    /**
     * phone number
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("phone number")
    private String phoneNumber;
    /**
     * users job title
     * 
     */
    @JsonProperty("jobTitle")
    @JsonPropertyDescription("users job title")
    private String jobTitle;
    /**
     * department
     * 
     */
    @JsonProperty("department")
    @JsonPropertyDescription("department")
    private String department;
    /**
     * is user active
     * 
     */
    @JsonProperty("isActive")
    @JsonPropertyDescription("is user active")
    private String isActive;
    /**
     * create timestamp
     * 
     */
    @JsonProperty("createTimestamp")
    @JsonPropertyDescription("create timestamp")
    private String createTimestamp;
    /**
     * modify timestamp
     * 
     */
    @JsonProperty("modifyTimestamp")
    @JsonPropertyDescription("modify timestamp")
    private String modifyTimestamp;
    /**
     * UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.
     * 
     */
    @JsonProperty("style")
    @JsonPropertyDescription("UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.")
    @Valid
    private Style style;
    /**
     * Fully qualified names of userEsks associated with this userEsk
     * 
     */
    @JsonProperty("associatedUserEsks")
    @JsonPropertyDescription("Fully qualified names of userEsks associated with this userEsk")
    @Valid
    private List<String> associatedUserEsks = new ArrayList<String>();
    /**
     * Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.
     * 
     */
    @JsonProperty("provider")
    @JsonPropertyDescription("Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.")
    private ProviderType provider = ProviderType.fromValue("user");
    /**
     * Children userEsks under this group are mutually exclusive. When mutually exclusive is `true` the userEsks from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the userEsks from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    @JsonPropertyDescription("Children userEsks under this group are mutually exclusive. When mutually exclusive is `true` the userEsks from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the userEsks from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.")
    private Boolean mutuallyExclusive = false;

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("userEskClassification")
    public String getUserEskClassification() {
        return userEskClassification;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("userEskClassification")
    public void setUserEskClassification(String userEskClassification) {
        this.userEskClassification = userEskClassification;
    }

    public CreateUserEsk withUserEskClassification(String userEskClassification) {
        this.userEskClassification = userEskClassification;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("parent")
    public String getParent() {
        return parent;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("parent")
    public void setParent(String parent) {
        this.parent = parent;
    }

    public CreateUserEsk withParent(String parent) {
        this.parent = parent;
        return this;
    }

    /**
     * Name of the userEsk.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the userEsk.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CreateUserEsk withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this userEsk.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this userEsk.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateUserEsk withDisplayName(String displayName) {
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

    public CreateUserEsk withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * last name
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * last name
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public CreateUserEsk withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * first name
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * first name
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public CreateUserEsk withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * middle name
     * 
     */
    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    /**
     * middle name
     * 
     */
    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public CreateUserEsk withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     * user email
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * user email
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public CreateUserEsk withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * user name
     * 
     */
    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    /**
     * user name
     * 
     */
    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public CreateUserEsk withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * full name
     * 
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * full name
     * 
     */
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public CreateUserEsk withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * phone number
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * phone number
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CreateUserEsk withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * users job title
     * 
     */
    @JsonProperty("jobTitle")
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * users job title
     * 
     */
    @JsonProperty("jobTitle")
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public CreateUserEsk withJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * department
     * 
     */
    @JsonProperty("department")
    public String getDepartment() {
        return department;
    }

    /**
     * department
     * 
     */
    @JsonProperty("department")
    public void setDepartment(String department) {
        this.department = department;
    }

    public CreateUserEsk withDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * is user active
     * 
     */
    @JsonProperty("isActive")
    public String getIsActive() {
        return isActive;
    }

    /**
     * is user active
     * 
     */
    @JsonProperty("isActive")
    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public CreateUserEsk withIsActive(String isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     * create timestamp
     * 
     */
    @JsonProperty("createTimestamp")
    public String getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * create timestamp
     * 
     */
    @JsonProperty("createTimestamp")
    public void setCreateTimestamp(String createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public CreateUserEsk withCreateTimestamp(String createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }

    /**
     * modify timestamp
     * 
     */
    @JsonProperty("modifyTimestamp")
    public String getModifyTimestamp() {
        return modifyTimestamp;
    }

    /**
     * modify timestamp
     * 
     */
    @JsonProperty("modifyTimestamp")
    public void setModifyTimestamp(String modifyTimestamp) {
        this.modifyTimestamp = modifyTimestamp;
    }

    public CreateUserEsk withModifyTimestamp(String modifyTimestamp) {
        this.modifyTimestamp = modifyTimestamp;
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

    public CreateUserEsk withStyle(Style style) {
        this.style = style;
        return this;
    }

    /**
     * Fully qualified names of userEsks associated with this userEsk
     * 
     */
    @JsonProperty("associatedUserEsks")
    public List<String> getAssociatedUserEsks() {
        return associatedUserEsks;
    }

    /**
     * Fully qualified names of userEsks associated with this userEsk
     * 
     */
    @JsonProperty("associatedUserEsks")
    public void setAssociatedUserEsks(List<String> associatedUserEsks) {
        this.associatedUserEsks = associatedUserEsks;
    }

    public CreateUserEsk withAssociatedUserEsks(List<String> associatedUserEsks) {
        this.associatedUserEsks = associatedUserEsks;
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

    public CreateUserEsk withProvider(ProviderType provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Children userEsks under this group are mutually exclusive. When mutually exclusive is `true` the userEsks from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the userEsks from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public Boolean getMutuallyExclusive() {
        return mutuallyExclusive;
    }

    /**
     * Children userEsks under this group are mutually exclusive. When mutually exclusive is `true` the userEsks from this group are used to **classify** an entity. An entity can only be in one class - example, it can only be either `tier1` or `tier2` and not both. When mutually exclusive is `false`, the userEsks from this group are used to **categorize** an entity. An entity can be in multiple categories simultaneously - example a customer can be `newCustomer` and `atRisk` simultaneously.
     * 
     */
    @JsonProperty("mutuallyExclusive")
    public void setMutuallyExclusive(Boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
    }

    public CreateUserEsk withMutuallyExclusive(Boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateUserEsk.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("userEskClassification");
        sb.append('=');
        sb.append(((this.userEskClassification == null)?"<null>":this.userEskClassification));
        sb.append(',');
        sb.append("parent");
        sb.append('=');
        sb.append(((this.parent == null)?"<null>":this.parent));
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
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("middleName");
        sb.append('=');
        sb.append(((this.middleName == null)?"<null>":this.middleName));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("userName");
        sb.append('=');
        sb.append(((this.userName == null)?"<null>":this.userName));
        sb.append(',');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("jobTitle");
        sb.append('=');
        sb.append(((this.jobTitle == null)?"<null>":this.jobTitle));
        sb.append(',');
        sb.append("department");
        sb.append('=');
        sb.append(((this.department == null)?"<null>":this.department));
        sb.append(',');
        sb.append("isActive");
        sb.append('=');
        sb.append(((this.isActive == null)?"<null>":this.isActive));
        sb.append(',');
        sb.append("createTimestamp");
        sb.append('=');
        sb.append(((this.createTimestamp == null)?"<null>":this.createTimestamp));
        sb.append(',');
        sb.append("modifyTimestamp");
        sb.append('=');
        sb.append(((this.modifyTimestamp == null)?"<null>":this.modifyTimestamp));
        sb.append(',');
        sb.append("style");
        sb.append('=');
        sb.append(((this.style == null)?"<null>":this.style));
        sb.append(',');
        sb.append("associatedUserEsks");
        sb.append('=');
        sb.append(((this.associatedUserEsks == null)?"<null>":this.associatedUserEsks));
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
        result = ((result* 31)+((this.parent == null)? 0 :this.parent.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.jobTitle == null)? 0 :this.jobTitle.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.userName == null)? 0 :this.userName.hashCode()));
        result = ((result* 31)+((this.isActive == null)? 0 :this.isActive.hashCode()));
        result = ((result* 31)+((this.createTimestamp == null)? 0 :this.createTimestamp.hashCode()));
        result = ((result* 31)+((this.modifyTimestamp == null)? 0 :this.modifyTimestamp.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.mutuallyExclusive == null)? 0 :this.mutuallyExclusive.hashCode()));
        result = ((result* 31)+((this.userEskClassification == null)? 0 :this.userEskClassification.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.middleName == null)? 0 :this.middleName.hashCode()));
        result = ((result* 31)+((this.style == null)? 0 :this.style.hashCode()));
        result = ((result* 31)+((this.department == null)? 0 :this.department.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.associatedUserEsks == null)? 0 :this.associatedUserEsks.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateUserEsk) == false) {
            return false;
        }
        CreateUserEsk rhs = ((CreateUserEsk) other);
        return ((((((((((((((((((((((this.parent == rhs.parent)||((this.parent!= null)&&this.parent.equals(rhs.parent)))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.jobTitle == rhs.jobTitle)||((this.jobTitle!= null)&&this.jobTitle.equals(rhs.jobTitle))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName))))&&((this.userName == rhs.userName)||((this.userName!= null)&&this.userName.equals(rhs.userName))))&&((this.isActive == rhs.isActive)||((this.isActive!= null)&&this.isActive.equals(rhs.isActive))))&&((this.createTimestamp == rhs.createTimestamp)||((this.createTimestamp!= null)&&this.createTimestamp.equals(rhs.createTimestamp))))&&((this.modifyTimestamp == rhs.modifyTimestamp)||((this.modifyTimestamp!= null)&&this.modifyTimestamp.equals(rhs.modifyTimestamp))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.mutuallyExclusive == rhs.mutuallyExclusive)||((this.mutuallyExclusive!= null)&&this.mutuallyExclusive.equals(rhs.mutuallyExclusive))))&&((this.userEskClassification == rhs.userEskClassification)||((this.userEskClassification!= null)&&this.userEskClassification.equals(rhs.userEskClassification))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.middleName == rhs.middleName)||((this.middleName!= null)&&this.middleName.equals(rhs.middleName))))&&((this.style == rhs.style)||((this.style!= null)&&this.style.equals(rhs.style))))&&((this.department == rhs.department)||((this.department!= null)&&this.department.equals(rhs.department))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.associatedUserEsks == rhs.associatedUserEsks)||((this.associatedUserEsks!= null)&&this.associatedUserEsks.equals(rhs.associatedUserEsks))));
    }

}
