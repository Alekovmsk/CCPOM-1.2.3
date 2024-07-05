
package org.openmetadata.schema.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.TagLabel;


/**
 * AddKnowledgeCenterToAssetsRequest
 * <p>
 * Create Request for adding a knowledgeCenter to assets
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "operation",
    "dryRun",
    "knowledgeCenterTags",
    "assets"
})
@Generated("jsonschema2pojo")
public class AddKnowledgeCenterToAssetsRequest {

    /**
     * Operation to be performed
     * 
     */
    @JsonProperty("operation")
    @JsonPropertyDescription("Operation to be performed")
    private AddKnowledgeCenterToAssetsRequest.Operation operation;
    /**
     * If true, the request will be validated but no changes will be made
     * 
     */
    @JsonProperty("dryRun")
    @JsonPropertyDescription("If true, the request will be validated but no changes will be made")
    private Boolean dryRun = true;
    /**
     * KnowledgeCenter Tags to be added
     * 
     */
    @JsonProperty("knowledgeCenterTags")
    @JsonPropertyDescription("KnowledgeCenter Tags to be added")
    @Valid
    private List<TagLabel> knowledgeCenterTags = null;
    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("assets")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> assets = null;

    /**
     * Operation to be performed
     * 
     */
    @JsonProperty("operation")
    public AddKnowledgeCenterToAssetsRequest.Operation getOperation() {
        return operation;
    }

    /**
     * Operation to be performed
     * 
     */
    @JsonProperty("operation")
    public void setOperation(AddKnowledgeCenterToAssetsRequest.Operation operation) {
        this.operation = operation;
    }

    public AddKnowledgeCenterToAssetsRequest withOperation(AddKnowledgeCenterToAssetsRequest.Operation operation) {
        this.operation = operation;
        return this;
    }

    /**
     * If true, the request will be validated but no changes will be made
     * 
     */
    @JsonProperty("dryRun")
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * If true, the request will be validated but no changes will be made
     * 
     */
    @JsonProperty("dryRun")
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public AddKnowledgeCenterToAssetsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * KnowledgeCenter Tags to be added
     * 
     */
    @JsonProperty("knowledgeCenterTags")
    public List<TagLabel> getKnowledgeCenterTags() {
        return knowledgeCenterTags;
    }

    /**
     * KnowledgeCenter Tags to be added
     * 
     */
    @JsonProperty("knowledgeCenterTags")
    public void setKnowledgeCenterTags(List<TagLabel> knowledgeCenterTags) {
        this.knowledgeCenterTags = knowledgeCenterTags;
    }

    public AddKnowledgeCenterToAssetsRequest withKnowledgeCenterTags(List<TagLabel> knowledgeCenterTags) {
        this.knowledgeCenterTags = knowledgeCenterTags;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("assets")
    public List<EntityReference> getAssets() {
        return assets;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("assets")
    public void setAssets(List<EntityReference> assets) {
        this.assets = assets;
    }

    public AddKnowledgeCenterToAssetsRequest withAssets(List<EntityReference> assets) {
        this.assets = assets;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AddKnowledgeCenterToAssetsRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("operation");
        sb.append('=');
        sb.append(((this.operation == null)?"<null>":this.operation));
        sb.append(',');
        sb.append("dryRun");
        sb.append('=');
        sb.append(((this.dryRun == null)?"<null>":this.dryRun));
        sb.append(',');
        sb.append("knowledgeCenterTags");
        sb.append('=');
        sb.append(((this.knowledgeCenterTags == null)?"<null>":this.knowledgeCenterTags));
        sb.append(',');
        sb.append("assets");
        sb.append('=');
        sb.append(((this.assets == null)?"<null>":this.assets));
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
        result = ((result* 31)+((this.dryRun == null)? 0 :this.dryRun.hashCode()));
        result = ((result* 31)+((this.assets == null)? 0 :this.assets.hashCode()));
        result = ((result* 31)+((this.operation == null)? 0 :this.operation.hashCode()));
        result = ((result* 31)+((this.knowledgeCenterTags == null)? 0 :this.knowledgeCenterTags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AddKnowledgeCenterToAssetsRequest) == false) {
            return false;
        }
        AddKnowledgeCenterToAssetsRequest rhs = ((AddKnowledgeCenterToAssetsRequest) other);
        return (((((this.dryRun == rhs.dryRun)||((this.dryRun!= null)&&this.dryRun.equals(rhs.dryRun)))&&((this.assets == rhs.assets)||((this.assets!= null)&&this.assets.equals(rhs.assets))))&&((this.operation == rhs.operation)||((this.operation!= null)&&this.operation.equals(rhs.operation))))&&((this.knowledgeCenterTags == rhs.knowledgeCenterTags)||((this.knowledgeCenterTags!= null)&&this.knowledgeCenterTags.equals(rhs.knowledgeCenterTags))));
    }


    /**
     * Operation to be performed
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Operation {

        ADD_ASSETS("AddAssets"),
        ADD_KNOWLEDGE_CENTER_TAGS("AddKnowledgeCenterTags");
        private final String value;
        private final static Map<String, AddKnowledgeCenterToAssetsRequest.Operation> CONSTANTS = new HashMap<String, AddKnowledgeCenterToAssetsRequest.Operation>();

        static {
            for (AddKnowledgeCenterToAssetsRequest.Operation c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Operation(String value) {
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
        public static AddKnowledgeCenterToAssetsRequest.Operation fromValue(String value) {
            AddKnowledgeCenterToAssetsRequest.Operation constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
