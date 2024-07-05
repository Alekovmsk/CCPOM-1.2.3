
package org.openmetadata.schema.api.data;

import java.net.URI;
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
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.LifeCycle;
import org.openmetadata.schema.type.MlFeature;
import org.openmetadata.schema.type.MlHyperParameter;
import org.openmetadata.schema.type.MlStore;
import org.openmetadata.schema.type.TagLabel;


/**
 * CreateMlModelRequest
 * <p>
 * Create Ml Model entity request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "algorithm",
    "mlFeatures",
    "target",
    "mlHyperParameters",
    "dashboard",
    "mlStore",
    "server",
    "tags",
    "owner",
    "service",
    "extension",
    "sourceUrl",
    "domain",
    "dataProducts",
    "lifeCycle",
    "sourceHash"
})
@Generated("jsonschema2pojo")
public class CreateMlModel implements CreateEntity
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
     * Display Name that identifies this ML model. It could be title or label from the source services
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this ML model. It could be title or label from the source services")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * Algorithm used to train the ML Model
     * (Required)
     * 
     */
    @JsonProperty("algorithm")
    @JsonPropertyDescription("Algorithm used to train the ML Model")
    @NotNull
    private String algorithm;
    /**
     * Features used to train the ML Model.
     * 
     */
    @JsonProperty("mlFeatures")
    @JsonPropertyDescription("Features used to train the ML Model.")
    @Valid
    private List<MlFeature> mlFeatures = null;
    /**
     * Name that identifies an entity.
     * 
     */
    @JsonProperty("target")
    @JsonPropertyDescription("Name that identifies an entity.")
    @Pattern(regexp = "^(?U)[\\w'\\- .&()%]+$")
    @Size(min = 1, max = 128)
    private String target;
    /**
     * Hyper Parameters used to train the ML Model.
     * 
     */
    @JsonProperty("mlHyperParameters")
    @JsonPropertyDescription("Hyper Parameters used to train the ML Model.")
    @Valid
    private List<MlHyperParameter> mlHyperParameters = null;
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("dashboard")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String dashboard;
    /**
     * Location containing the ML Model. It can be a storage layer and/or a container repository.
     * 
     */
    @JsonProperty("mlStore")
    @JsonPropertyDescription("Location containing the ML Model. It can be a storage layer and/or a container repository.")
    @Valid
    private MlStore mlStore;
    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("server")
    @JsonPropertyDescription("URI that points to a resource.")
    private URI server;
    /**
     * Tags for this ML Model
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this ML Model")
    @Valid
    private List<TagLabel> tags = null;
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
     * (Required)
     * 
     */
    @JsonProperty("service")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    @NotNull
    private String service;
    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    @JsonPropertyDescription("Entity extension data with custom attributes added to the entity.")
    private Object extension;
    /**
     * Source Url of the respective entity.
     * 
     */
    @JsonProperty("sourceUrl")
    @JsonPropertyDescription("Source Url of the respective entity.")
    private String sourceUrl;
    /**
     * Fully qualified name of the domain the MLModel belongs to.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("Fully qualified name of the domain the MLModel belongs to.")
    private String domain;
    /**
     * List of fully qualified names of data products this entity is part of.
     * 
     */
    @JsonProperty("dataProducts")
    @JsonPropertyDescription("List of fully qualified names of data products this entity is part of.")
    @Valid
    private List<String> dataProducts = new ArrayList<String>();
    /**
     * Life Cycle
     * <p>
     * This schema defines Life Cycle Properties.
     * 
     */
    @JsonProperty("lifeCycle")
    @JsonPropertyDescription("This schema defines Life Cycle Properties.")
    @Valid
    private LifeCycle lifeCycle;
    /**
     * Source hash of the entity
     * 
     */
    @JsonProperty("sourceHash")
    @JsonPropertyDescription("Source hash of the entity")
    @Size(min = 1, max = 32)
    private String sourceHash;

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

    public CreateMlModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this ML model. It could be title or label from the source services
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this ML model. It could be title or label from the source services
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateMlModel withDisplayName(String displayName) {
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

    public CreateMlModel withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Algorithm used to train the ML Model
     * (Required)
     * 
     */
    @JsonProperty("algorithm")
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * Algorithm used to train the ML Model
     * (Required)
     * 
     */
    @JsonProperty("algorithm")
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public CreateMlModel withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * Features used to train the ML Model.
     * 
     */
    @JsonProperty("mlFeatures")
    public List<MlFeature> getMlFeatures() {
        return mlFeatures;
    }

    /**
     * Features used to train the ML Model.
     * 
     */
    @JsonProperty("mlFeatures")
    public void setMlFeatures(List<MlFeature> mlFeatures) {
        this.mlFeatures = mlFeatures;
    }

    public CreateMlModel withMlFeatures(List<MlFeature> mlFeatures) {
        this.mlFeatures = mlFeatures;
        return this;
    }

    /**
     * Name that identifies an entity.
     * 
     */
    @JsonProperty("target")
    public String getTarget() {
        return target;
    }

    /**
     * Name that identifies an entity.
     * 
     */
    @JsonProperty("target")
    public void setTarget(String target) {
        this.target = target;
    }

    public CreateMlModel withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Hyper Parameters used to train the ML Model.
     * 
     */
    @JsonProperty("mlHyperParameters")
    public List<MlHyperParameter> getMlHyperParameters() {
        return mlHyperParameters;
    }

    /**
     * Hyper Parameters used to train the ML Model.
     * 
     */
    @JsonProperty("mlHyperParameters")
    public void setMlHyperParameters(List<MlHyperParameter> mlHyperParameters) {
        this.mlHyperParameters = mlHyperParameters;
    }

    public CreateMlModel withMlHyperParameters(List<MlHyperParameter> mlHyperParameters) {
        this.mlHyperParameters = mlHyperParameters;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("dashboard")
    public String getDashboard() {
        return dashboard;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("dashboard")
    public void setDashboard(String dashboard) {
        this.dashboard = dashboard;
    }

    public CreateMlModel withDashboard(String dashboard) {
        this.dashboard = dashboard;
        return this;
    }

    /**
     * Location containing the ML Model. It can be a storage layer and/or a container repository.
     * 
     */
    @JsonProperty("mlStore")
    public MlStore getMlStore() {
        return mlStore;
    }

    /**
     * Location containing the ML Model. It can be a storage layer and/or a container repository.
     * 
     */
    @JsonProperty("mlStore")
    public void setMlStore(MlStore mlStore) {
        this.mlStore = mlStore;
    }

    public CreateMlModel withMlStore(MlStore mlStore) {
        this.mlStore = mlStore;
        return this;
    }

    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("server")
    public URI getServer() {
        return server;
    }

    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("server")
    public void setServer(URI server) {
        this.server = server;
    }

    public CreateMlModel withServer(URI server) {
        this.server = server;
        return this;
    }

    /**
     * Tags for this ML Model
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this ML Model
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public CreateMlModel withTags(List<TagLabel> tags) {
        this.tags = tags;
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

    public CreateMlModel withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("service")
    public String getService() {
        return service;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("service")
    public void setService(String service) {
        this.service = service;
    }

    public CreateMlModel withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    public Object getExtension() {
        return extension;
    }

    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    public void setExtension(Object extension) {
        this.extension = extension;
    }

    public CreateMlModel withExtension(Object extension) {
        this.extension = extension;
        return this;
    }

    /**
     * Source Url of the respective entity.
     * 
     */
    @JsonProperty("sourceUrl")
    public String getSourceUrl() {
        return sourceUrl;
    }

    /**
     * Source Url of the respective entity.
     * 
     */
    @JsonProperty("sourceUrl")
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public CreateMlModel withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * Fully qualified name of the domain the MLModel belongs to.
     * 
     */
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    /**
     * Fully qualified name of the domain the MLModel belongs to.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CreateMlModel withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * List of fully qualified names of data products this entity is part of.
     * 
     */
    @JsonProperty("dataProducts")
    public List<String> getDataProducts() {
        return dataProducts;
    }

    /**
     * List of fully qualified names of data products this entity is part of.
     * 
     */
    @JsonProperty("dataProducts")
    public void setDataProducts(List<String> dataProducts) {
        this.dataProducts = dataProducts;
    }

    public CreateMlModel withDataProducts(List<String> dataProducts) {
        this.dataProducts = dataProducts;
        return this;
    }

    /**
     * Life Cycle
     * <p>
     * This schema defines Life Cycle Properties.
     * 
     */
    @JsonProperty("lifeCycle")
    public LifeCycle getLifeCycle() {
        return lifeCycle;
    }

    /**
     * Life Cycle
     * <p>
     * This schema defines Life Cycle Properties.
     * 
     */
    @JsonProperty("lifeCycle")
    public void setLifeCycle(LifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    public CreateMlModel withLifeCycle(LifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;
        return this;
    }

    /**
     * Source hash of the entity
     * 
     */
    @JsonProperty("sourceHash")
    public String getSourceHash() {
        return sourceHash;
    }

    /**
     * Source hash of the entity
     * 
     */
    @JsonProperty("sourceHash")
    public void setSourceHash(String sourceHash) {
        this.sourceHash = sourceHash;
    }

    public CreateMlModel withSourceHash(String sourceHash) {
        this.sourceHash = sourceHash;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateMlModel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("algorithm");
        sb.append('=');
        sb.append(((this.algorithm == null)?"<null>":this.algorithm));
        sb.append(',');
        sb.append("mlFeatures");
        sb.append('=');
        sb.append(((this.mlFeatures == null)?"<null>":this.mlFeatures));
        sb.append(',');
        sb.append("target");
        sb.append('=');
        sb.append(((this.target == null)?"<null>":this.target));
        sb.append(',');
        sb.append("mlHyperParameters");
        sb.append('=');
        sb.append(((this.mlHyperParameters == null)?"<null>":this.mlHyperParameters));
        sb.append(',');
        sb.append("dashboard");
        sb.append('=');
        sb.append(((this.dashboard == null)?"<null>":this.dashboard));
        sb.append(',');
        sb.append("mlStore");
        sb.append('=');
        sb.append(((this.mlStore == null)?"<null>":this.mlStore));
        sb.append(',');
        sb.append("server");
        sb.append('=');
        sb.append(((this.server == null)?"<null>":this.server));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("service");
        sb.append('=');
        sb.append(((this.service == null)?"<null>":this.service));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("sourceUrl");
        sb.append('=');
        sb.append(((this.sourceUrl == null)?"<null>":this.sourceUrl));
        sb.append(',');
        sb.append("domain");
        sb.append('=');
        sb.append(((this.domain == null)?"<null>":this.domain));
        sb.append(',');
        sb.append("dataProducts");
        sb.append('=');
        sb.append(((this.dataProducts == null)?"<null>":this.dataProducts));
        sb.append(',');
        sb.append("lifeCycle");
        sb.append('=');
        sb.append(((this.lifeCycle == null)?"<null>":this.lifeCycle));
        sb.append(',');
        sb.append("sourceHash");
        sb.append('=');
        sb.append(((this.sourceHash == null)?"<null>":this.sourceHash));
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
        result = ((result* 31)+((this.server == null)? 0 :this.server.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.mlHyperParameters == null)? 0 :this.mlHyperParameters.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.dataProducts == null)? 0 :this.dataProducts.hashCode()));
        result = ((result* 31)+((this.target == null)? 0 :this.target.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.sourceUrl == null)? 0 :this.sourceUrl.hashCode()));
        result = ((result* 31)+((this.sourceHash == null)? 0 :this.sourceHash.hashCode()));
        result = ((result* 31)+((this.service == null)? 0 :this.service.hashCode()));
        result = ((result* 31)+((this.mlFeatures == null)? 0 :this.mlFeatures.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.mlStore == null)? 0 :this.mlStore.hashCode()));
        result = ((result* 31)+((this.lifeCycle == null)? 0 :this.lifeCycle.hashCode()));
        result = ((result* 31)+((this.dashboard == null)? 0 :this.dashboard.hashCode()));
        result = ((result* 31)+((this.algorithm == null)? 0 :this.algorithm.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateMlModel) == false) {
            return false;
        }
        CreateMlModel rhs = ((CreateMlModel) other);
        return ((((((((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.server == rhs.server)||((this.server!= null)&&this.server.equals(rhs.server))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.mlHyperParameters == rhs.mlHyperParameters)||((this.mlHyperParameters!= null)&&this.mlHyperParameters.equals(rhs.mlHyperParameters))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.dataProducts == rhs.dataProducts)||((this.dataProducts!= null)&&this.dataProducts.equals(rhs.dataProducts))))&&((this.target == rhs.target)||((this.target!= null)&&this.target.equals(rhs.target))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.sourceUrl == rhs.sourceUrl)||((this.sourceUrl!= null)&&this.sourceUrl.equals(rhs.sourceUrl))))&&((this.sourceHash == rhs.sourceHash)||((this.sourceHash!= null)&&this.sourceHash.equals(rhs.sourceHash))))&&((this.service == rhs.service)||((this.service!= null)&&this.service.equals(rhs.service))))&&((this.mlFeatures == rhs.mlFeatures)||((this.mlFeatures!= null)&&this.mlFeatures.equals(rhs.mlFeatures))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.mlStore == rhs.mlStore)||((this.mlStore!= null)&&this.mlStore.equals(rhs.mlStore))))&&((this.lifeCycle == rhs.lifeCycle)||((this.lifeCycle!= null)&&this.lifeCycle.equals(rhs.lifeCycle))))&&((this.dashboard == rhs.dashboard)||((this.dashboard!= null)&&this.dashboard.equals(rhs.dashboard))))&&((this.algorithm == rhs.algorithm)||((this.algorithm!= null)&&this.algorithm.equals(rhs.algorithm))));
    }

}
