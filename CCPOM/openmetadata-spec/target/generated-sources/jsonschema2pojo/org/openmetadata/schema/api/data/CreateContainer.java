
package org.openmetadata.schema.api.data;

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
import org.openmetadata.schema.type.ContainerDataModel;
import org.openmetadata.schema.type.ContainerFileFormat;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.LifeCycle;
import org.openmetadata.schema.type.TagLabel;


/**
 * CreateContainerRequest
 * <p>
 * Create Container Model entity request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "service",
    "parent",
    "dataModel",
    "prefix",
    "numberOfObjects",
    "size",
    "fileFormats",
    "owner",
    "tags",
    "extension",
    "sourceUrl",
    "domain",
    "dataProducts",
    "lifeCycle",
    "sourceHash"
})
@Generated("jsonschema2pojo")
public class CreateContainer implements CreateEntity
{

    /**
     * Name of a container. Expected to be unique in the same level containers.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of a container. Expected to be unique in the same level containers.")
    @Pattern(regexp = "^((?!::).)*$")
    @Size(min = 1, max = 128)
    @NotNull
    private String name;
    /**
     * Display Name that identifies this Container model.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this Container model.")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
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
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("parent")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference parent;
    /**
     * This captures information about how the container's data is modeled, if it has a schema. 
     * 
     */
    @JsonProperty("dataModel")
    @JsonPropertyDescription("This captures information about how the container's data is modeled, if it has a schema. ")
    @Valid
    private ContainerDataModel dataModel;
    /**
     * Optional prefix path defined for this container
     * 
     */
    @JsonProperty("prefix")
    @JsonPropertyDescription("Optional prefix path defined for this container")
    private String prefix = null;
    /**
     * The number of objects/files this container has.
     * 
     */
    @JsonProperty("numberOfObjects")
    @JsonPropertyDescription("The number of objects/files this container has.")
    private Double numberOfObjects = null;
    /**
     * The total size in KB this container has.
     * 
     */
    @JsonProperty("size")
    @JsonPropertyDescription("The total size in KB this container has.")
    private Double size = null;
    /**
     * File & data formats identified for the container:  e.g. dataFormats=[csv, json]. These can be present both when the container has a dataModel or not
     * 
     */
    @JsonProperty("fileFormats")
    @JsonPropertyDescription("File & data formats identified for the container:  e.g. dataFormats=[csv, json]. These can be present both when the container has a dataModel or not")
    @Valid
    private List<ContainerFileFormat> fileFormats = null;
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
     * Tags for this Container Model
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this Container Model")
    @Valid
    private List<TagLabel> tags = null;
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
     * Fully qualified name of the domain the Container belongs to.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("Fully qualified name of the domain the Container belongs to.")
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
     * Name of a container. Expected to be unique in the same level containers.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of a container. Expected to be unique in the same level containers.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CreateContainer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this Container model.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this Container model.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateContainer withDisplayName(String displayName) {
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

    public CreateContainer withDescription(String description) {
        this.description = description;
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

    public CreateContainer withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("parent")
    public EntityReference getParent() {
        return parent;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("parent")
    public void setParent(EntityReference parent) {
        this.parent = parent;
    }

    public CreateContainer withParent(EntityReference parent) {
        this.parent = parent;
        return this;
    }

    /**
     * This captures information about how the container's data is modeled, if it has a schema. 
     * 
     */
    @JsonProperty("dataModel")
    public ContainerDataModel getDataModel() {
        return dataModel;
    }

    /**
     * This captures information about how the container's data is modeled, if it has a schema. 
     * 
     */
    @JsonProperty("dataModel")
    public void setDataModel(ContainerDataModel dataModel) {
        this.dataModel = dataModel;
    }

    public CreateContainer withDataModel(ContainerDataModel dataModel) {
        this.dataModel = dataModel;
        return this;
    }

    /**
     * Optional prefix path defined for this container
     * 
     */
    @JsonProperty("prefix")
    public String getPrefix() {
        return prefix;
    }

    /**
     * Optional prefix path defined for this container
     * 
     */
    @JsonProperty("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public CreateContainer withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * The number of objects/files this container has.
     * 
     */
    @JsonProperty("numberOfObjects")
    public Double getNumberOfObjects() {
        return numberOfObjects;
    }

    /**
     * The number of objects/files this container has.
     * 
     */
    @JsonProperty("numberOfObjects")
    public void setNumberOfObjects(Double numberOfObjects) {
        this.numberOfObjects = numberOfObjects;
    }

    public CreateContainer withNumberOfObjects(Double numberOfObjects) {
        this.numberOfObjects = numberOfObjects;
        return this;
    }

    /**
     * The total size in KB this container has.
     * 
     */
    @JsonProperty("size")
    public Double getSize() {
        return size;
    }

    /**
     * The total size in KB this container has.
     * 
     */
    @JsonProperty("size")
    public void setSize(Double size) {
        this.size = size;
    }

    public CreateContainer withSize(Double size) {
        this.size = size;
        return this;
    }

    /**
     * File & data formats identified for the container:  e.g. dataFormats=[csv, json]. These can be present both when the container has a dataModel or not
     * 
     */
    @JsonProperty("fileFormats")
    public List<ContainerFileFormat> getFileFormats() {
        return fileFormats;
    }

    /**
     * File & data formats identified for the container:  e.g. dataFormats=[csv, json]. These can be present both when the container has a dataModel or not
     * 
     */
    @JsonProperty("fileFormats")
    public void setFileFormats(List<ContainerFileFormat> fileFormats) {
        this.fileFormats = fileFormats;
    }

    public CreateContainer withFileFormats(List<ContainerFileFormat> fileFormats) {
        this.fileFormats = fileFormats;
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

    public CreateContainer withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Tags for this Container Model
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this Container Model
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public CreateContainer withTags(List<TagLabel> tags) {
        this.tags = tags;
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

    public CreateContainer withExtension(Object extension) {
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

    public CreateContainer withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * Fully qualified name of the domain the Container belongs to.
     * 
     */
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    /**
     * Fully qualified name of the domain the Container belongs to.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CreateContainer withDomain(String domain) {
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

    public CreateContainer withDataProducts(List<String> dataProducts) {
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

    public CreateContainer withLifeCycle(LifeCycle lifeCycle) {
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

    public CreateContainer withSourceHash(String sourceHash) {
        this.sourceHash = sourceHash;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateContainer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("service");
        sb.append('=');
        sb.append(((this.service == null)?"<null>":this.service));
        sb.append(',');
        sb.append("parent");
        sb.append('=');
        sb.append(((this.parent == null)?"<null>":this.parent));
        sb.append(',');
        sb.append("dataModel");
        sb.append('=');
        sb.append(((this.dataModel == null)?"<null>":this.dataModel));
        sb.append(',');
        sb.append("prefix");
        sb.append('=');
        sb.append(((this.prefix == null)?"<null>":this.prefix));
        sb.append(',');
        sb.append("numberOfObjects");
        sb.append('=');
        sb.append(((this.numberOfObjects == null)?"<null>":this.numberOfObjects));
        sb.append(',');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null)?"<null>":this.size));
        sb.append(',');
        sb.append("fileFormats");
        sb.append('=');
        sb.append(((this.fileFormats == null)?"<null>":this.fileFormats));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
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
        result = ((result* 31)+((this.parent == null)? 0 :this.parent.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.prefix == null)? 0 :this.prefix.hashCode()));
        result = ((result* 31)+((this.dataModel == null)? 0 :this.dataModel.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.dataProducts == null)? 0 :this.dataProducts.hashCode()));
        result = ((result* 31)+((this.fileFormats == null)? 0 :this.fileFormats.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.sourceUrl == null)? 0 :this.sourceUrl.hashCode()));
        result = ((result* 31)+((this.sourceHash == null)? 0 :this.sourceHash.hashCode()));
        result = ((result* 31)+((this.size == null)? 0 :this.size.hashCode()));
        result = ((result* 31)+((this.numberOfObjects == null)? 0 :this.numberOfObjects.hashCode()));
        result = ((result* 31)+((this.service == null)? 0 :this.service.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.lifeCycle == null)? 0 :this.lifeCycle.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateContainer) == false) {
            return false;
        }
        CreateContainer rhs = ((CreateContainer) other);
        return (((((((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.parent == rhs.parent)||((this.parent!= null)&&this.parent.equals(rhs.parent))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.prefix == rhs.prefix)||((this.prefix!= null)&&this.prefix.equals(rhs.prefix))))&&((this.dataModel == rhs.dataModel)||((this.dataModel!= null)&&this.dataModel.equals(rhs.dataModel))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.dataProducts == rhs.dataProducts)||((this.dataProducts!= null)&&this.dataProducts.equals(rhs.dataProducts))))&&((this.fileFormats == rhs.fileFormats)||((this.fileFormats!= null)&&this.fileFormats.equals(rhs.fileFormats))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.sourceUrl == rhs.sourceUrl)||((this.sourceUrl!= null)&&this.sourceUrl.equals(rhs.sourceUrl))))&&((this.sourceHash == rhs.sourceHash)||((this.sourceHash!= null)&&this.sourceHash.equals(rhs.sourceHash))))&&((this.size == rhs.size)||((this.size!= null)&&this.size.equals(rhs.size))))&&((this.numberOfObjects == rhs.numberOfObjects)||((this.numberOfObjects!= null)&&this.numberOfObjects.equals(rhs.numberOfObjects))))&&((this.service == rhs.service)||((this.service!= null)&&this.service.equals(rhs.service))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.lifeCycle == rhs.lifeCycle)||((this.lifeCycle!= null)&&this.lifeCycle.equals(rhs.lifeCycle))));
    }

}
