
package org.openmetadata.schema.type;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EntityRelationship
 * <p>
 * This schema defines the EntityRelationship type used for establishing relationship between two entities. EntityRelationship is used for capturing relationships from one entity to another. For example, a database contains tables.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fromId",
    "fromFQN",
    "fromEntity",
    "toId",
    "toFQN",
    "toEntity",
    "relation",
    "relationshipType",
    "deleted"
})
@Generated("jsonschema2pojo")
public class EntityRelationship {

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("fromId")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID fromId;
    /**
     * Fully qualified name of the entity from which the relationship originates.
     * 
     */
    @JsonProperty("fromFQN")
    @JsonPropertyDescription("Fully qualified name of the entity from which the relationship originates.")
    private String fromFQN;
    /**
     * Type of the entity from which the relationship originates. Examples: `database`, `table`, `metrics` ...
     * (Required)
     * 
     */
    @JsonProperty("fromEntity")
    @JsonPropertyDescription("Type of the entity from which the relationship originates. Examples: `database`, `table`, `metrics` ...")
    @NotNull
    private String fromEntity;
    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("toId")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID toId;
    /**
     * Fully qualified name of the entity towards which the relationship refers to.
     * 
     */
    @JsonProperty("toFQN")
    @JsonPropertyDescription("Fully qualified name of the entity towards which the relationship refers to.")
    private String toFQN;
    /**
     * Type of the entity towards which the relationship refers to. Examples: `database`, `table`, `metrics` ...
     * (Required)
     * 
     */
    @JsonProperty("toEntity")
    @JsonPropertyDescription("Type of the entity towards which the relationship refers to. Examples: `database`, `table`, `metrics` ...")
    @NotNull
    private String toEntity;
    /**
     * Describes relationship between the two entities as an integer.
     * 
     */
    @JsonProperty("relation")
    @JsonPropertyDescription("Describes relationship between the two entities as an integer.")
    @DecimalMin("0")
    private Integer relation;
    /**
     * This enum captures all the relationships between Catalog entities. Note that the relationship from is a Strong entity and to is Weak entity when possible.Rules for changing enums since the ordinal position is stored in the database: (1) Don't remove an enum, since the database might have stored the enum ordinal number. (2) When adding a new enum, add it as the last enum to preserve the ordinal positions of the existing enums.
     * (Required)
     * 
     */
    @JsonProperty("relationshipType")
    @JsonPropertyDescription("This enum captures all the relationships between Catalog entities. Note that the relationship from is a Strong entity and to is Weak entity when possible.")
    @NotNull
    private Relationship relationshipType;
    /**
     * `true` indicates the relationship has been soft deleted.
     * 
     */
    @JsonProperty("deleted")
    @JsonPropertyDescription("`true` indicates the relationship has been soft deleted.")
    private Boolean deleted = false;

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("fromId")
    public UUID getFromId() {
        return fromId;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("fromId")
    public void setFromId(UUID fromId) {
        this.fromId = fromId;
    }

    public EntityRelationship withFromId(UUID fromId) {
        this.fromId = fromId;
        return this;
    }

    /**
     * Fully qualified name of the entity from which the relationship originates.
     * 
     */
    @JsonProperty("fromFQN")
    public String getFromFQN() {
        return fromFQN;
    }

    /**
     * Fully qualified name of the entity from which the relationship originates.
     * 
     */
    @JsonProperty("fromFQN")
    public void setFromFQN(String fromFQN) {
        this.fromFQN = fromFQN;
    }

    public EntityRelationship withFromFQN(String fromFQN) {
        this.fromFQN = fromFQN;
        return this;
    }

    /**
     * Type of the entity from which the relationship originates. Examples: `database`, `table`, `metrics` ...
     * (Required)
     * 
     */
    @JsonProperty("fromEntity")
    public String getFromEntity() {
        return fromEntity;
    }

    /**
     * Type of the entity from which the relationship originates. Examples: `database`, `table`, `metrics` ...
     * (Required)
     * 
     */
    @JsonProperty("fromEntity")
    public void setFromEntity(String fromEntity) {
        this.fromEntity = fromEntity;
    }

    public EntityRelationship withFromEntity(String fromEntity) {
        this.fromEntity = fromEntity;
        return this;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("toId")
    public UUID getToId() {
        return toId;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("toId")
    public void setToId(UUID toId) {
        this.toId = toId;
    }

    public EntityRelationship withToId(UUID toId) {
        this.toId = toId;
        return this;
    }

    /**
     * Fully qualified name of the entity towards which the relationship refers to.
     * 
     */
    @JsonProperty("toFQN")
    public String getToFQN() {
        return toFQN;
    }

    /**
     * Fully qualified name of the entity towards which the relationship refers to.
     * 
     */
    @JsonProperty("toFQN")
    public void setToFQN(String toFQN) {
        this.toFQN = toFQN;
    }

    public EntityRelationship withToFQN(String toFQN) {
        this.toFQN = toFQN;
        return this;
    }

    /**
     * Type of the entity towards which the relationship refers to. Examples: `database`, `table`, `metrics` ...
     * (Required)
     * 
     */
    @JsonProperty("toEntity")
    public String getToEntity() {
        return toEntity;
    }

    /**
     * Type of the entity towards which the relationship refers to. Examples: `database`, `table`, `metrics` ...
     * (Required)
     * 
     */
    @JsonProperty("toEntity")
    public void setToEntity(String toEntity) {
        this.toEntity = toEntity;
    }

    public EntityRelationship withToEntity(String toEntity) {
        this.toEntity = toEntity;
        return this;
    }

    /**
     * Describes relationship between the two entities as an integer.
     * 
     */
    @JsonProperty("relation")
    public Integer getRelation() {
        return relation;
    }

    /**
     * Describes relationship between the two entities as an integer.
     * 
     */
    @JsonProperty("relation")
    public void setRelation(Integer relation) {
        this.relation = relation;
    }

    public EntityRelationship withRelation(Integer relation) {
        this.relation = relation;
        return this;
    }

    /**
     * This enum captures all the relationships between Catalog entities. Note that the relationship from is a Strong entity and to is Weak entity when possible.Rules for changing enums since the ordinal position is stored in the database: (1) Don't remove an enum, since the database might have stored the enum ordinal number. (2) When adding a new enum, add it as the last enum to preserve the ordinal positions of the existing enums.
     * (Required)
     * 
     */
    @JsonProperty("relationshipType")
    public Relationship getRelationshipType() {
        return relationshipType;
    }

    /**
     * This enum captures all the relationships between Catalog entities. Note that the relationship from is a Strong entity and to is Weak entity when possible.Rules for changing enums since the ordinal position is stored in the database: (1) Don't remove an enum, since the database might have stored the enum ordinal number. (2) When adding a new enum, add it as the last enum to preserve the ordinal positions of the existing enums.
     * (Required)
     * 
     */
    @JsonProperty("relationshipType")
    public void setRelationshipType(Relationship relationshipType) {
        this.relationshipType = relationshipType;
    }

    public EntityRelationship withRelationshipType(Relationship relationshipType) {
        this.relationshipType = relationshipType;
        return this;
    }

    /**
     * `true` indicates the relationship has been soft deleted.
     * 
     */
    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * `true` indicates the relationship has been soft deleted.
     * 
     */
    @JsonProperty("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public EntityRelationship withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EntityRelationship.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fromId");
        sb.append('=');
        sb.append(((this.fromId == null)?"<null>":this.fromId));
        sb.append(',');
        sb.append("fromFQN");
        sb.append('=');
        sb.append(((this.fromFQN == null)?"<null>":this.fromFQN));
        sb.append(',');
        sb.append("fromEntity");
        sb.append('=');
        sb.append(((this.fromEntity == null)?"<null>":this.fromEntity));
        sb.append(',');
        sb.append("toId");
        sb.append('=');
        sb.append(((this.toId == null)?"<null>":this.toId));
        sb.append(',');
        sb.append("toFQN");
        sb.append('=');
        sb.append(((this.toFQN == null)?"<null>":this.toFQN));
        sb.append(',');
        sb.append("toEntity");
        sb.append('=');
        sb.append(((this.toEntity == null)?"<null>":this.toEntity));
        sb.append(',');
        sb.append("relation");
        sb.append('=');
        sb.append(((this.relation == null)?"<null>":this.relation));
        sb.append(',');
        sb.append("relationshipType");
        sb.append('=');
        sb.append(((this.relationshipType == null)?"<null>":this.relationshipType));
        sb.append(',');
        sb.append("deleted");
        sb.append('=');
        sb.append(((this.deleted == null)?"<null>":this.deleted));
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
        result = ((result* 31)+((this.toId == null)? 0 :this.toId.hashCode()));
        result = ((result* 31)+((this.toEntity == null)? 0 :this.toEntity.hashCode()));
        result = ((result* 31)+((this.deleted == null)? 0 :this.deleted.hashCode()));
        result = ((result* 31)+((this.fromEntity == null)? 0 :this.fromEntity.hashCode()));
        result = ((result* 31)+((this.relationshipType == null)? 0 :this.relationshipType.hashCode()));
        result = ((result* 31)+((this.fromFQN == null)? 0 :this.fromFQN.hashCode()));
        result = ((result* 31)+((this.fromId == null)? 0 :this.fromId.hashCode()));
        result = ((result* 31)+((this.toFQN == null)? 0 :this.toFQN.hashCode()));
        result = ((result* 31)+((this.relation == null)? 0 :this.relation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EntityRelationship) == false) {
            return false;
        }
        EntityRelationship rhs = ((EntityRelationship) other);
        return ((((((((((this.toId == rhs.toId)||((this.toId!= null)&&this.toId.equals(rhs.toId)))&&((this.toEntity == rhs.toEntity)||((this.toEntity!= null)&&this.toEntity.equals(rhs.toEntity))))&&((this.deleted == rhs.deleted)||((this.deleted!= null)&&this.deleted.equals(rhs.deleted))))&&((this.fromEntity == rhs.fromEntity)||((this.fromEntity!= null)&&this.fromEntity.equals(rhs.fromEntity))))&&((this.relationshipType == rhs.relationshipType)||((this.relationshipType!= null)&&this.relationshipType.equals(rhs.relationshipType))))&&((this.fromFQN == rhs.fromFQN)||((this.fromFQN!= null)&&this.fromFQN.equals(rhs.fromFQN))))&&((this.fromId == rhs.fromId)||((this.fromId!= null)&&this.fromId.equals(rhs.fromId))))&&((this.toFQN == rhs.toFQN)||((this.toFQN!= null)&&this.toFQN.equals(rhs.toFQN))))&&((this.relation == rhs.relation)||((this.relation!= null)&&this.relation.equals(rhs.relation))));
    }

}
