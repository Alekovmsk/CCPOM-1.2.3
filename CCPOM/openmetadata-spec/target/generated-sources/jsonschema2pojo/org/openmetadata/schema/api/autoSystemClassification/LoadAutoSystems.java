
package org.openmetadata.schema.api.autoSystemClassification;

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
 * loadAutoSystems
 * <p>
 * Load classifications and autoSystems
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "createAutoSystemClassification",
    "createAutoSystems"
})
@Generated("jsonschema2pojo")
public class LoadAutoSystems {

    /**
     * CreateAutoSystemClassificationRequest
     * <p>
     * Create autoSystem classification request
     * (Required)
     * 
     */
    @JsonProperty("createAutoSystemClassification")
    @JsonPropertyDescription("Create autoSystem classification request")
    @Valid
    @NotNull
    private CreateAutoSystemClassification createAutoSystemClassification;
    @JsonProperty("createAutoSystems")
    @Size(min = 1)
    @Valid
    private List<CreateAutoSystem> createAutoSystems = new ArrayList<CreateAutoSystem>();

    /**
     * CreateAutoSystemClassificationRequest
     * <p>
     * Create autoSystem classification request
     * (Required)
     * 
     */
    @JsonProperty("createAutoSystemClassification")
    public CreateAutoSystemClassification getCreateAutoSystemClassification() {
        return createAutoSystemClassification;
    }

    /**
     * CreateAutoSystemClassificationRequest
     * <p>
     * Create autoSystem classification request
     * (Required)
     * 
     */
    @JsonProperty("createAutoSystemClassification")
    public void setCreateAutoSystemClassification(CreateAutoSystemClassification createAutoSystemClassification) {
        this.createAutoSystemClassification = createAutoSystemClassification;
    }

    public LoadAutoSystems withCreateAutoSystemClassification(CreateAutoSystemClassification createAutoSystemClassification) {
        this.createAutoSystemClassification = createAutoSystemClassification;
        return this;
    }

    @JsonProperty("createAutoSystems")
    public List<CreateAutoSystem> getCreateAutoSystems() {
        return createAutoSystems;
    }

    @JsonProperty("createAutoSystems")
    public void setCreateAutoSystems(List<CreateAutoSystem> createAutoSystems) {
        this.createAutoSystems = createAutoSystems;
    }

    public LoadAutoSystems withCreateAutoSystems(List<CreateAutoSystem> createAutoSystems) {
        this.createAutoSystems = createAutoSystems;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LoadAutoSystems.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("createAutoSystemClassification");
        sb.append('=');
        sb.append(((this.createAutoSystemClassification == null)?"<null>":this.createAutoSystemClassification));
        sb.append(',');
        sb.append("createAutoSystems");
        sb.append('=');
        sb.append(((this.createAutoSystems == null)?"<null>":this.createAutoSystems));
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
        result = ((result* 31)+((this.createAutoSystemClassification == null)? 0 :this.createAutoSystemClassification.hashCode()));
        result = ((result* 31)+((this.createAutoSystems == null)? 0 :this.createAutoSystems.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadAutoSystems) == false) {
            return false;
        }
        LoadAutoSystems rhs = ((LoadAutoSystems) other);
        return (((this.createAutoSystemClassification == rhs.createAutoSystemClassification)||((this.createAutoSystemClassification!= null)&&this.createAutoSystemClassification.equals(rhs.createAutoSystemClassification)))&&((this.createAutoSystems == rhs.createAutoSystems)||((this.createAutoSystems!= null)&&this.createAutoSystems.equals(rhs.createAutoSystems))));
    }

}
