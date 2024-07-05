
package org.openmetadata.schema.api.spdClassification;

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
 * loadSpds
 * <p>
 * Load classifications and spds
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "createSpdClassification",
    "createSpds"
})
@Generated("jsonschema2pojo")
public class LoadSpds {

    /**
     * CreateSpdClassificationRequest
     * <p>
     * Create spd classification request
     * (Required)
     * 
     */
    @JsonProperty("createSpdClassification")
    @JsonPropertyDescription("Create spd classification request")
    @Valid
    @NotNull
    private CreateSpdClassification createSpdClassification;
    @JsonProperty("createSpds")
    @Size(min = 1)
    @Valid
    private List<CreateSpd> createSpds = new ArrayList<CreateSpd>();

    /**
     * CreateSpdClassificationRequest
     * <p>
     * Create spd classification request
     * (Required)
     * 
     */
    @JsonProperty("createSpdClassification")
    public CreateSpdClassification getCreateSpdClassification() {
        return createSpdClassification;
    }

    /**
     * CreateSpdClassificationRequest
     * <p>
     * Create spd classification request
     * (Required)
     * 
     */
    @JsonProperty("createSpdClassification")
    public void setCreateSpdClassification(CreateSpdClassification createSpdClassification) {
        this.createSpdClassification = createSpdClassification;
    }

    public LoadSpds withCreateSpdClassification(CreateSpdClassification createSpdClassification) {
        this.createSpdClassification = createSpdClassification;
        return this;
    }

    @JsonProperty("createSpds")
    public List<CreateSpd> getCreateSpds() {
        return createSpds;
    }

    @JsonProperty("createSpds")
    public void setCreateSpds(List<CreateSpd> createSpds) {
        this.createSpds = createSpds;
    }

    public LoadSpds withCreateSpds(List<CreateSpd> createSpds) {
        this.createSpds = createSpds;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LoadSpds.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("createSpdClassification");
        sb.append('=');
        sb.append(((this.createSpdClassification == null)?"<null>":this.createSpdClassification));
        sb.append(',');
        sb.append("createSpds");
        sb.append('=');
        sb.append(((this.createSpds == null)?"<null>":this.createSpds));
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
        result = ((result* 31)+((this.createSpds == null)? 0 :this.createSpds.hashCode()));
        result = ((result* 31)+((this.createSpdClassification == null)? 0 :this.createSpdClassification.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadSpds) == false) {
            return false;
        }
        LoadSpds rhs = ((LoadSpds) other);
        return (((this.createSpds == rhs.createSpds)||((this.createSpds!= null)&&this.createSpds.equals(rhs.createSpds)))&&((this.createSpdClassification == rhs.createSpdClassification)||((this.createSpdClassification!= null)&&this.createSpdClassification.equals(rhs.createSpdClassification))));
    }

}
