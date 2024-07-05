
package org.openmetadata.schema.entity.policies.accessControl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import org.openmetadata.schema.type.MetadataOperation;


/**
 * Rule
 * <p>
 * Describes an Access Control Rule for OpenMetadata Metadata Operations. All non-null user (subject) and entity (object) attributes are evaluated with logical AND.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "fullyQualifiedName",
    "description",
    "effect",
    "operations",
    "resources",
    "condition"
})
@Generated("jsonschema2pojo")
public class Rule {

    /**
     * Name of this Rule.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of this Rule.")
    @NotNull
    private String name;
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
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("effect")
    @NotNull
    private Rule.Effect effect;
    /**
     * List of operation names related to the `resources`. Use `*` to include all the operations.
     * (Required)
     * 
     */
    @JsonProperty("operations")
    @JsonPropertyDescription("List of operation names related to the `resources`. Use `*` to include all the operations.")
    @Valid
    @NotNull
    private List<MetadataOperation> operations = null;
    /**
     * Resources/objects related to this rule. Resources are typically `entityTypes` such as `table`, `database`, etc. It also includes `non-entityType` resources such as `lineage`. Use `*` to include all the resources.
     * (Required)
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("Resources/objects related to this rule. Resources are typically `entityTypes` such as `table`, `database`, etc. It also includes `non-entityType` resources such as `lineage`. Use `*` to include all the resources.")
    @Valid
    @NotNull
    private List<String> resources = null;
    /**
     * Expression in SpEL.
     * 
     */
    @JsonProperty("condition")
    @JsonPropertyDescription("Expression in SpEL.")
    private String condition;

    /**
     * Name of this Rule.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of this Rule.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Rule withName(String name) {
        this.name = name;
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

    public Rule withFullyQualifiedName(String fullyQualifiedName) {
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

    public Rule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("effect")
    public Rule.Effect getEffect() {
        return effect;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("effect")
    public void setEffect(Rule.Effect effect) {
        this.effect = effect;
    }

    public Rule withEffect(Rule.Effect effect) {
        this.effect = effect;
        return this;
    }

    /**
     * List of operation names related to the `resources`. Use `*` to include all the operations.
     * (Required)
     * 
     */
    @JsonProperty("operations")
    public List<MetadataOperation> getOperations() {
        return operations;
    }

    /**
     * List of operation names related to the `resources`. Use `*` to include all the operations.
     * (Required)
     * 
     */
    @JsonProperty("operations")
    public void setOperations(List<MetadataOperation> operations) {
        this.operations = operations;
    }

    public Rule withOperations(List<MetadataOperation> operations) {
        this.operations = operations;
        return this;
    }

    /**
     * Resources/objects related to this rule. Resources are typically `entityTypes` such as `table`, `database`, etc. It also includes `non-entityType` resources such as `lineage`. Use `*` to include all the resources.
     * (Required)
     * 
     */
    @JsonProperty("resources")
    public List<String> getResources() {
        return resources;
    }

    /**
     * Resources/objects related to this rule. Resources are typically `entityTypes` such as `table`, `database`, etc. It also includes `non-entityType` resources such as `lineage`. Use `*` to include all the resources.
     * (Required)
     * 
     */
    @JsonProperty("resources")
    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    public Rule withResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Expression in SpEL.
     * 
     */
    @JsonProperty("condition")
    public String getCondition() {
        return condition;
    }

    /**
     * Expression in SpEL.
     * 
     */
    @JsonProperty("condition")
    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Rule withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rule.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("effect");
        sb.append('=');
        sb.append(((this.effect == null)?"<null>":this.effect));
        sb.append(',');
        sb.append("operations");
        sb.append('=');
        sb.append(((this.operations == null)?"<null>":this.operations));
        sb.append(',');
        sb.append("resources");
        sb.append('=');
        sb.append(((this.resources == null)?"<null>":this.resources));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
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
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.operations == null)? 0 :this.operations.hashCode()));
        result = ((result* 31)+((this.effect == null)? 0 :this.effect.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.resources == null)? 0 :this.resources.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rule) == false) {
            return false;
        }
        Rule rhs = ((Rule) other);
        return ((((((((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition)))&&((this.operations == rhs.operations)||((this.operations!= null)&&this.operations.equals(rhs.operations))))&&((this.effect == rhs.effect)||((this.effect!= null)&&this.effect.equals(rhs.effect))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.resources == rhs.resources)||((this.resources!= null)&&this.resources.equals(rhs.resources))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))));
    }

    @Generated("jsonschema2pojo")
    public enum Effect {

        ALLOW("allow"),
        DENY("deny");
        private final String value;
        private final static Map<String, Rule.Effect> CONSTANTS = new HashMap<String, Rule.Effect>();

        static {
            for (Rule.Effect c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Effect(String value) {
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
        public static Rule.Effect fromValue(String value) {
            Rule.Effect constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
