
package org.openmetadata.schema.entity.automations;

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


/**
 * CreateWorkflowRequest
 * <p>
 * A unit of work that will be triggered as an API call to the OpenMetadata server.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "workflowType",
    "request",
    "status",
    "response",
    "owner"
})
@Generated("jsonschema2pojo")
public class CreateWorkflow implements CreateEntity
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
     * Display Name that identifies this workflow definition.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this workflow definition.")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * This enum defines the type for which this workflow applies to.
     * (Required)
     * 
     */
    @JsonProperty("workflowType")
    @JsonPropertyDescription("This enum defines the type for which this workflow applies to.")
    @NotNull
    private WorkflowType workflowType;
    /**
     * Request body for a specific workflow type
     * (Required)
     * 
     */
    @JsonProperty("request")
    @JsonPropertyDescription("Request body for a specific workflow type")
    @NotNull
    private Object request;
    /**
     * Enum defining possible Workflow status
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Enum defining possible Workflow status")
    private WorkflowStatus status;
    /**
     * Response to the request.
     * 
     */
    @JsonProperty("response")
    @JsonPropertyDescription("Response to the request.")
    private Object response;
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

    public CreateWorkflow withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this workflow definition.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this workflow definition.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateWorkflow withDisplayName(String displayName) {
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

    public CreateWorkflow withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * This enum defines the type for which this workflow applies to.
     * (Required)
     * 
     */
    @JsonProperty("workflowType")
    public WorkflowType getWorkflowType() {
        return workflowType;
    }

    /**
     * This enum defines the type for which this workflow applies to.
     * (Required)
     * 
     */
    @JsonProperty("workflowType")
    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }

    public CreateWorkflow withWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
        return this;
    }

    /**
     * Request body for a specific workflow type
     * (Required)
     * 
     */
    @JsonProperty("request")
    public Object getRequest() {
        return request;
    }

    /**
     * Request body for a specific workflow type
     * (Required)
     * 
     */
    @JsonProperty("request")
    public void setRequest(Object request) {
        this.request = request;
    }

    public CreateWorkflow withRequest(Object request) {
        this.request = request;
        return this;
    }

    /**
     * Enum defining possible Workflow status
     * 
     */
    @JsonProperty("status")
    public WorkflowStatus getStatus() {
        return status;
    }

    /**
     * Enum defining possible Workflow status
     * 
     */
    @JsonProperty("status")
    public void setStatus(WorkflowStatus status) {
        this.status = status;
    }

    public CreateWorkflow withStatus(WorkflowStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Response to the request.
     * 
     */
    @JsonProperty("response")
    public Object getResponse() {
        return response;
    }

    /**
     * Response to the request.
     * 
     */
    @JsonProperty("response")
    public void setResponse(Object response) {
        this.response = response;
    }

    public CreateWorkflow withResponse(Object response) {
        this.response = response;
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

    public CreateWorkflow withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateWorkflow.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("workflowType");
        sb.append('=');
        sb.append(((this.workflowType == null)?"<null>":this.workflowType));
        sb.append(',');
        sb.append("request");
        sb.append('=');
        sb.append(((this.request == null)?"<null>":this.request));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("response");
        sb.append('=');
        sb.append(((this.response == null)?"<null>":this.response));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
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
        result = ((result* 31)+((this.request == null)? 0 :this.request.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.response == null)? 0 :this.response.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.workflowType == null)? 0 :this.workflowType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateWorkflow) == false) {
            return false;
        }
        CreateWorkflow rhs = ((CreateWorkflow) other);
        return (((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.request == rhs.request)||((this.request!= null)&&this.request.equals(rhs.request))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.response == rhs.response)||((this.response!= null)&&this.response.equals(rhs.response))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.workflowType == rhs.workflowType)||((this.workflowType!= null)&&this.workflowType.equals(rhs.workflowType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
