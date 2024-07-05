
package org.openmetadata.schema.api.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
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
import org.openmetadata.schema.EnumInterface;
import org.openmetadata.schema.entity.services.MetadataConnection;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.TagLabel;


/**
 * CreateMetadataServiceRequest
 * <p>
 * Create Metadata Service entity request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "serviceType",
    "connection",
    "owner",
    "tags"
})
@Generated("jsonschema2pojo")
public class CreateMetadataService implements CreateEntity
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
     * Display Name that identifies this Metadata service.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this Metadata service.")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * Type of database service such as Amundsen, Atlas...
     * (Required)
     * 
     */
    @JsonProperty("serviceType")
    @JsonPropertyDescription("Type of database service such as Amundsen, Atlas...")
    @NotNull
    private CreateMetadataService.MetadataServiceType serviceType;
    /**
     * Metadata Service Connection.
     * 
     */
    @JsonProperty("connection")
    @JsonPropertyDescription("Metadata Service Connection.")
    @Valid
    private MetadataConnection connection;
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
     * Tags for this Metadata Service.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this Metadata Service.")
    @Valid
    private List<TagLabel> tags = null;

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

    public CreateMetadataService withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this Metadata service.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this Metadata service.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateMetadataService withDisplayName(String displayName) {
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

    public CreateMetadataService withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Type of database service such as Amundsen, Atlas...
     * (Required)
     * 
     */
    @JsonProperty("serviceType")
    public CreateMetadataService.MetadataServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Type of database service such as Amundsen, Atlas...
     * (Required)
     * 
     */
    @JsonProperty("serviceType")
    public void setServiceType(CreateMetadataService.MetadataServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public CreateMetadataService withServiceType(CreateMetadataService.MetadataServiceType serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * Metadata Service Connection.
     * 
     */
    @JsonProperty("connection")
    public MetadataConnection getConnection() {
        return connection;
    }

    /**
     * Metadata Service Connection.
     * 
     */
    @JsonProperty("connection")
    public void setConnection(MetadataConnection connection) {
        this.connection = connection;
    }

    public CreateMetadataService withConnection(MetadataConnection connection) {
        this.connection = connection;
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

    public CreateMetadataService withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Tags for this Metadata Service.
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this Metadata Service.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public CreateMetadataService withTags(List<TagLabel> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateMetadataService.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("serviceType");
        sb.append('=');
        sb.append(((this.serviceType == null)?"<null>":this.serviceType));
        sb.append(',');
        sb.append("connection");
        sb.append('=');
        sb.append(((this.connection == null)?"<null>":this.connection));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
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
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.connection == null)? 0 :this.connection.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateMetadataService) == false) {
            return false;
        }
        CreateMetadataService rhs = ((CreateMetadataService) other);
        return ((((((((this.serviceType == rhs.serviceType)||((this.serviceType!= null)&&this.serviceType.equals(rhs.serviceType)))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.connection == rhs.connection)||((this.connection!= null)&&this.connection.equals(rhs.connection))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }


    /**
     * Type of database service such as Amundsen, Atlas...
     * 
     */
    @Generated("jsonschema2pojo")
    public enum MetadataServiceType
        implements EnumInterface
    {

        Amundsen("Amundsen"),
        MetadataES("MetadataES"),
        OpenMetadataServer("OpenMetadata"),
        Atlas("Atlas");
        private final String value;
        private final static Map<String, CreateMetadataService.MetadataServiceType> CONSTANTS = new HashMap<String, CreateMetadataService.MetadataServiceType>();

        static {
            for (CreateMetadataService.MetadataServiceType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MetadataServiceType(String value) {
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
        public static CreateMetadataService.MetadataServiceType fromValue(String value) {
            CreateMetadataService.MetadataServiceType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
