
package org.openmetadata.schema.tests;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.schema.EnumInterface;
import org.openmetadata.schema.ServiceEntityInterface;
import org.openmetadata.schema.entity.services.connections.TestConnectionResult;
import org.openmetadata.schema.tests.type.TestSummary;
import org.openmetadata.schema.type.ChangeDescription;
import org.openmetadata.schema.type.EntityReference;


/**
 * TestSuite
 * <p>
 * TestSuite is a set of test cases grouped together to capture data quality tests against data entities.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "displayName",
    "fullyQualifiedName",
    "description",
    "tests",
    "connection",
    "testConnectionResult",
    "pipelines",
    "serviceType",
    "owner",
    "version",
    "updatedAt",
    "updatedBy",
    "href",
    "changeDescription",
    "deleted",
    "executable",
    "executableEntityReference",
    "summary",
    "testCaseResultSummary"
})
@Generated("jsonschema2pojo")
public class TestSuite implements ServiceEntityInterface
{

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID id;
    /**
     * Name of a test suite entity. For executable testSuite, this should match the entity FQN in the platform.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of a test suite entity. For executable testSuite, this should match the entity FQN in the platform.")
    @Size(min = 1, max = 256)
    @NotNull
    private String name;
    /**
     * Display Name that identifies this test suite.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this test suite.")
    private String displayName;
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
    @JsonProperty("tests")
    @Valid
    private List<EntityReference> tests = null;
    @JsonProperty("connection")
    @Valid
    private TestSuiteConnection connection;
    /**
     * TestConnectionResult
     * <p>
     * TestConnectionResult is the definition that will encapsulate result of running the test connection steps.
     * 
     */
    @JsonProperty("testConnectionResult")
    @JsonPropertyDescription("TestConnectionResult is the definition that will encapsulate result of running the test connection steps.")
    @Valid
    private TestConnectionResult testConnectionResult;
    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("pipelines")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> pipelines = null;
    /**
     * Type of database service such as MySQL, BigQuery, Snowflake, Redshift, Postgres...
     * 
     */
    @JsonProperty("serviceType")
    @JsonPropertyDescription("Type of database service such as MySQL, BigQuery, Snowflake, Redshift, Postgres...")
    private TestSuite.ServiceType serviceType = TestSuite.ServiceType.fromValue("TestSuite");
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
     * Indicates if the test suite is executable. Set on the backend.
     * 
     */
    @JsonProperty("executable")
    @JsonPropertyDescription("Indicates if the test suite is executable. Set on the backend.")
    private Boolean executable = false;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("executableEntityReference")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference executableEntityReference;
    /**
     * Schema to capture test case execution summary.
     * 
     */
    @JsonProperty("summary")
    @JsonPropertyDescription("Schema to capture test case execution summary.")
    @Valid
    private TestSummary summary;
    /**
     * Summary of test case execution
     * 
     */
    @JsonProperty("testCaseResultSummary")
    @JsonPropertyDescription("Summary of test case execution")
    @Valid
    private List<ResultSummary> testCaseResultSummary = new ArrayList<ResultSummary>();

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    public TestSuite withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Name of a test suite entity. For executable testSuite, this should match the entity FQN in the platform.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of a test suite entity. For executable testSuite, this should match the entity FQN in the platform.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public TestSuite withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this test suite.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this test suite.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public TestSuite withDisplayName(String displayName) {
        this.displayName = displayName;
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

    public TestSuite withFullyQualifiedName(String fullyQualifiedName) {
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

    public TestSuite withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("tests")
    public List<EntityReference> getTests() {
        return tests;
    }

    @JsonProperty("tests")
    public void setTests(List<EntityReference> tests) {
        this.tests = tests;
    }

    public TestSuite withTests(List<EntityReference> tests) {
        this.tests = tests;
        return this;
    }

    @JsonProperty("connection")
    public TestSuiteConnection getConnection() {
        return connection;
    }

    @JsonProperty("connection")
    public void setConnection(TestSuiteConnection connection) {
        this.connection = connection;
    }

    public TestSuite withConnection(TestSuiteConnection connection) {
        this.connection = connection;
        return this;
    }

    /**
     * TestConnectionResult
     * <p>
     * TestConnectionResult is the definition that will encapsulate result of running the test connection steps.
     * 
     */
    @JsonProperty("testConnectionResult")
    public TestConnectionResult getTestConnectionResult() {
        return testConnectionResult;
    }

    /**
     * TestConnectionResult
     * <p>
     * TestConnectionResult is the definition that will encapsulate result of running the test connection steps.
     * 
     */
    @JsonProperty("testConnectionResult")
    public void setTestConnectionResult(TestConnectionResult testConnectionResult) {
        this.testConnectionResult = testConnectionResult;
    }

    public TestSuite withTestConnectionResult(TestConnectionResult testConnectionResult) {
        this.testConnectionResult = testConnectionResult;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("pipelines")
    public List<EntityReference> getPipelines() {
        return pipelines;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("pipelines")
    public void setPipelines(List<EntityReference> pipelines) {
        this.pipelines = pipelines;
    }

    public TestSuite withPipelines(List<EntityReference> pipelines) {
        this.pipelines = pipelines;
        return this;
    }

    /**
     * Type of database service such as MySQL, BigQuery, Snowflake, Redshift, Postgres...
     * 
     */
    @JsonProperty("serviceType")
    public TestSuite.ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Type of database service such as MySQL, BigQuery, Snowflake, Redshift, Postgres...
     * 
     */
    @JsonProperty("serviceType")
    public void setServiceType(TestSuite.ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public TestSuite withServiceType(TestSuite.ServiceType serviceType) {
        this.serviceType = serviceType;
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

    public TestSuite withOwner(EntityReference owner) {
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

    public TestSuite withVersion(Double version) {
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

    public TestSuite withUpdatedAt(Long updatedAt) {
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

    public TestSuite withUpdatedBy(String updatedBy) {
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

    public TestSuite withHref(URI href) {
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

    public TestSuite withChangeDescription(ChangeDescription changeDescription) {
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

    public TestSuite withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Indicates if the test suite is executable. Set on the backend.
     * 
     */
    @JsonProperty("executable")
    public Boolean getExecutable() {
        return executable;
    }

    /**
     * Indicates if the test suite is executable. Set on the backend.
     * 
     */
    @JsonProperty("executable")
    public void setExecutable(Boolean executable) {
        this.executable = executable;
    }

    public TestSuite withExecutable(Boolean executable) {
        this.executable = executable;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("executableEntityReference")
    public EntityReference getExecutableEntityReference() {
        return executableEntityReference;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("executableEntityReference")
    public void setExecutableEntityReference(EntityReference executableEntityReference) {
        this.executableEntityReference = executableEntityReference;
    }

    public TestSuite withExecutableEntityReference(EntityReference executableEntityReference) {
        this.executableEntityReference = executableEntityReference;
        return this;
    }

    /**
     * Schema to capture test case execution summary.
     * 
     */
    @JsonProperty("summary")
    public TestSummary getSummary() {
        return summary;
    }

    /**
     * Schema to capture test case execution summary.
     * 
     */
    @JsonProperty("summary")
    public void setSummary(TestSummary summary) {
        this.summary = summary;
    }

    public TestSuite withSummary(TestSummary summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Summary of test case execution
     * 
     */
    @JsonProperty("testCaseResultSummary")
    public List<ResultSummary> getTestCaseResultSummary() {
        return testCaseResultSummary;
    }

    /**
     * Summary of test case execution
     * 
     */
    @JsonProperty("testCaseResultSummary")
    public void setTestCaseResultSummary(List<ResultSummary> testCaseResultSummary) {
        this.testCaseResultSummary = testCaseResultSummary;
    }

    public TestSuite withTestCaseResultSummary(List<ResultSummary> testCaseResultSummary) {
        this.testCaseResultSummary = testCaseResultSummary;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestSuite.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("tests");
        sb.append('=');
        sb.append(((this.tests == null)?"<null>":this.tests));
        sb.append(',');
        sb.append("connection");
        sb.append('=');
        sb.append(((this.connection == null)?"<null>":this.connection));
        sb.append(',');
        sb.append("testConnectionResult");
        sb.append('=');
        sb.append(((this.testConnectionResult == null)?"<null>":this.testConnectionResult));
        sb.append(',');
        sb.append("pipelines");
        sb.append('=');
        sb.append(((this.pipelines == null)?"<null>":this.pipelines));
        sb.append(',');
        sb.append("serviceType");
        sb.append('=');
        sb.append(((this.serviceType == null)?"<null>":this.serviceType));
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
        sb.append("executable");
        sb.append('=');
        sb.append(((this.executable == null)?"<null>":this.executable));
        sb.append(',');
        sb.append("executableEntityReference");
        sb.append('=');
        sb.append(((this.executableEntityReference == null)?"<null>":this.executableEntityReference));
        sb.append(',');
        sb.append("summary");
        sb.append('=');
        sb.append(((this.summary == null)?"<null>":this.summary));
        sb.append(',');
        sb.append("testCaseResultSummary");
        sb.append('=');
        sb.append(((this.testCaseResultSummary == null)?"<null>":this.testCaseResultSummary));
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
        result = ((result* 31)+((this.serviceType == null)? 0 :this.serviceType.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.executableEntityReference == null)? 0 :this.executableEntityReference.hashCode()));
        result = ((result* 31)+((this.summary == null)? 0 :this.summary.hashCode()));
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.changeDescription == null)? 0 :this.changeDescription.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.executable == null)? 0 :this.executable.hashCode()));
        result = ((result* 31)+((this.tests == null)? 0 :this.tests.hashCode()));
        result = ((result* 31)+((this.pipelines == null)? 0 :this.pipelines.hashCode()));
        result = ((result* 31)+((this.deleted == null)? 0 :this.deleted.hashCode()));
        result = ((result* 31)+((this.testConnectionResult == null)? 0 :this.testConnectionResult.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.connection == null)? 0 :this.connection.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.testCaseResultSummary == null)? 0 :this.testCaseResultSummary.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestSuite) == false) {
            return false;
        }
        TestSuite rhs = ((TestSuite) other);
        return ((((((((((((((((((((((this.serviceType == rhs.serviceType)||((this.serviceType!= null)&&this.serviceType.equals(rhs.serviceType)))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.executableEntityReference == rhs.executableEntityReference)||((this.executableEntityReference!= null)&&this.executableEntityReference.equals(rhs.executableEntityReference))))&&((this.summary == rhs.summary)||((this.summary!= null)&&this.summary.equals(rhs.summary))))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.changeDescription == rhs.changeDescription)||((this.changeDescription!= null)&&this.changeDescription.equals(rhs.changeDescription))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.executable == rhs.executable)||((this.executable!= null)&&this.executable.equals(rhs.executable))))&&((this.tests == rhs.tests)||((this.tests!= null)&&this.tests.equals(rhs.tests))))&&((this.pipelines == rhs.pipelines)||((this.pipelines!= null)&&this.pipelines.equals(rhs.pipelines))))&&((this.deleted == rhs.deleted)||((this.deleted!= null)&&this.deleted.equals(rhs.deleted))))&&((this.testConnectionResult == rhs.testConnectionResult)||((this.testConnectionResult!= null)&&this.testConnectionResult.equals(rhs.testConnectionResult))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.connection == rhs.connection)||((this.connection!= null)&&this.connection.equals(rhs.connection))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.testCaseResultSummary == rhs.testCaseResultSummary)||((this.testCaseResultSummary!= null)&&this.testCaseResultSummary.equals(rhs.testCaseResultSummary))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }


    /**
     * Type of database service such as MySQL, BigQuery, Snowflake, Redshift, Postgres...
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ServiceType
        implements EnumInterface
    {

        TEST_SUITE("TestSuite");
        private final String value;
        private final static Map<String, TestSuite.ServiceType> CONSTANTS = new HashMap<String, TestSuite.ServiceType>();

        static {
            for (TestSuite.ServiceType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ServiceType(String value) {
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
        public static TestSuite.ServiceType fromValue(String value) {
            TestSuite.ServiceType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
