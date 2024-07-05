
package org.openmetadata.schema.api.tests;

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
import org.openmetadata.schema.tests.TestCaseParameter;
import org.openmetadata.schema.tests.TestPlatform;
import org.openmetadata.schema.type.ColumnDataType;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.TestDefinitionEntityType;


/**
 * CreateTestDefinitionRequest
 * <p>
 * Schema corresponding to a Test Definition
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "owner",
    "entityType",
    "testPlatforms",
    "supportedDataTypes",
    "parameterDefinition"
})
@Generated("jsonschema2pojo")
public class CreateTestDefinition implements CreateEntity
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
     * Display Name that identifies this test case.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this test case.")
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
     * This enum defines the type for which this test definition applies to.
     * (Required)
     * 
     */
    @JsonProperty("entityType")
    @JsonPropertyDescription("This enum defines the type for which this test definition applies to.")
    @NotNull
    private TestDefinitionEntityType entityType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("testPlatforms")
    @Valid
    @NotNull
    private List<TestPlatform> testPlatforms = new ArrayList<TestPlatform>();
    @JsonProperty("supportedDataTypes")
    @Valid
    private List<ColumnDataType> supportedDataTypes = new ArrayList<ColumnDataType>();
    @JsonProperty("parameterDefinition")
    @Valid
    private List<TestCaseParameter> parameterDefinition = new ArrayList<TestCaseParameter>();

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

    public CreateTestDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this test case.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this test case.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateTestDefinition withDisplayName(String displayName) {
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

    public CreateTestDefinition withDescription(String description) {
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

    public CreateTestDefinition withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * This enum defines the type for which this test definition applies to.
     * (Required)
     * 
     */
    @JsonProperty("entityType")
    public TestDefinitionEntityType getEntityType() {
        return entityType;
    }

    /**
     * This enum defines the type for which this test definition applies to.
     * (Required)
     * 
     */
    @JsonProperty("entityType")
    public void setEntityType(TestDefinitionEntityType entityType) {
        this.entityType = entityType;
    }

    public CreateTestDefinition withEntityType(TestDefinitionEntityType entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("testPlatforms")
    public List<TestPlatform> getTestPlatforms() {
        return testPlatforms;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("testPlatforms")
    public void setTestPlatforms(List<TestPlatform> testPlatforms) {
        this.testPlatforms = testPlatforms;
    }

    public CreateTestDefinition withTestPlatforms(List<TestPlatform> testPlatforms) {
        this.testPlatforms = testPlatforms;
        return this;
    }

    @JsonProperty("supportedDataTypes")
    public List<ColumnDataType> getSupportedDataTypes() {
        return supportedDataTypes;
    }

    @JsonProperty("supportedDataTypes")
    public void setSupportedDataTypes(List<ColumnDataType> supportedDataTypes) {
        this.supportedDataTypes = supportedDataTypes;
    }

    public CreateTestDefinition withSupportedDataTypes(List<ColumnDataType> supportedDataTypes) {
        this.supportedDataTypes = supportedDataTypes;
        return this;
    }

    @JsonProperty("parameterDefinition")
    public List<TestCaseParameter> getParameterDefinition() {
        return parameterDefinition;
    }

    @JsonProperty("parameterDefinition")
    public void setParameterDefinition(List<TestCaseParameter> parameterDefinition) {
        this.parameterDefinition = parameterDefinition;
    }

    public CreateTestDefinition withParameterDefinition(List<TestCaseParameter> parameterDefinition) {
        this.parameterDefinition = parameterDefinition;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateTestDefinition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("testPlatforms");
        sb.append('=');
        sb.append(((this.testPlatforms == null)?"<null>":this.testPlatforms));
        sb.append(',');
        sb.append("supportedDataTypes");
        sb.append('=');
        sb.append(((this.supportedDataTypes == null)?"<null>":this.supportedDataTypes));
        sb.append(',');
        sb.append("parameterDefinition");
        sb.append('=');
        sb.append(((this.parameterDefinition == null)?"<null>":this.parameterDefinition));
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
        result = ((result* 31)+((this.testPlatforms == null)? 0 :this.testPlatforms.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.supportedDataTypes == null)? 0 :this.supportedDataTypes.hashCode()));
        result = ((result* 31)+((this.parameterDefinition == null)? 0 :this.parameterDefinition.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateTestDefinition) == false) {
            return false;
        }
        CreateTestDefinition rhs = ((CreateTestDefinition) other);
        return (((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.testPlatforms == rhs.testPlatforms)||((this.testPlatforms!= null)&&this.testPlatforms.equals(rhs.testPlatforms))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.supportedDataTypes == rhs.supportedDataTypes)||((this.supportedDataTypes!= null)&&this.supportedDataTypes.equals(rhs.supportedDataTypes))))&&((this.parameterDefinition == rhs.parameterDefinition)||((this.parameterDefinition!= null)&&this.parameterDefinition.equals(rhs.parameterDefinition))));
    }

}
