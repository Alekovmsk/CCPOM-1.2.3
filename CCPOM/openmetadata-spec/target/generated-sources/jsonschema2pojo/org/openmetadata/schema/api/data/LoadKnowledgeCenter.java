
package org.openmetadata.schema.api.data;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * loadKnowledgeCenter
 * <p>
 * Load a KnowledgeCenter
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "createKnowledgeCenter",
    "createDocuments"
})
@Generated("jsonschema2pojo")
public class LoadKnowledgeCenter {

    /**
     * CreateKnowledgeCenterRequest
     * <p>
     * Create Knowledge Center entity request
     * (Required)
     * 
     */
    @JsonProperty("createKnowledgeCenter")
    @JsonPropertyDescription("Create Knowledge Center entity request")
    @Valid
    @NotNull
    private CreateKnowledgeCenter createKnowledgeCenter;
    @JsonProperty("createDocuments")
    @Size(min = 1)
    @Valid
    private List<CreateKnowledgeCenterDocument> createDocuments = new ArrayList<CreateKnowledgeCenterDocument>();

    /**
     * CreateKnowledgeCenterRequest
     * <p>
     * Create Knowledge Center entity request
     * (Required)
     * 
     */
    @JsonProperty("createKnowledgeCenter")
    public CreateKnowledgeCenter getCreateKnowledgeCenter() {
        return createKnowledgeCenter;
    }

    /**
     * CreateKnowledgeCenterRequest
     * <p>
     * Create Knowledge Center entity request
     * (Required)
     * 
     */
    @JsonProperty("createKnowledgeCenter")
    public void setCreateKnowledgeCenter(CreateKnowledgeCenter createKnowledgeCenter) {
        this.createKnowledgeCenter = createKnowledgeCenter;
    }

    public LoadKnowledgeCenter withCreateKnowledgeCenter(CreateKnowledgeCenter createKnowledgeCenter) {
        this.createKnowledgeCenter = createKnowledgeCenter;
        return this;
    }

    @JsonProperty("createDocuments")
    public List<CreateKnowledgeCenterDocument> getCreateDocuments() {
        return createDocuments;
    }

    @JsonProperty("createDocuments")
    public void setCreateDocuments(List<CreateKnowledgeCenterDocument> createDocuments) {
        this.createDocuments = createDocuments;
    }

    public LoadKnowledgeCenter withCreateDocuments(List<CreateKnowledgeCenterDocument> createDocuments) {
        this.createDocuments = createDocuments;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LoadKnowledgeCenter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("createKnowledgeCenter");
        sb.append('=');
        sb.append(((this.createKnowledgeCenter == null)?"<null>":this.createKnowledgeCenter));
        sb.append(',');
        sb.append("createDocuments");
        sb.append('=');
        sb.append(((this.createDocuments == null)?"<null>":this.createDocuments));
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
        result = ((result* 31)+((this.createKnowledgeCenter == null)? 0 :this.createKnowledgeCenter.hashCode()));
        result = ((result* 31)+((this.createDocuments == null)? 0 :this.createDocuments.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadKnowledgeCenter) == false) {
            return false;
        }
        LoadKnowledgeCenter rhs = ((LoadKnowledgeCenter) other);
        return (((this.createKnowledgeCenter == rhs.createKnowledgeCenter)||((this.createKnowledgeCenter!= null)&&this.createKnowledgeCenter.equals(rhs.createKnowledgeCenter)))&&((this.createDocuments == rhs.createDocuments)||((this.createDocuments!= null)&&this.createDocuments.equals(rhs.createDocuments))));
    }

}
