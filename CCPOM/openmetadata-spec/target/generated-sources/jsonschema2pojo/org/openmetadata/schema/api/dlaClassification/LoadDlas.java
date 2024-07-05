
package org.openmetadata.schema.api.dlaClassification;

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
 * loadDlas
 * <p>
 * Load classifications and dlas
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "createDlaClassification",
    "createDlas"
})
@Generated("jsonschema2pojo")
public class LoadDlas {

    /**
     * CreateDlaClassificationRequest
     * <p>
     * Create dla classification request
     * (Required)
     * 
     */
    @JsonProperty("createDlaClassification")
    @JsonPropertyDescription("Create dla classification request")
    @Valid
    @NotNull
    private CreateDlaClassification createDlaClassification;
    @JsonProperty("createDlas")
    @Size(min = 1)
    @Valid
    private List<CreateDla> createDlas = new ArrayList<CreateDla>();

    /**
     * CreateDlaClassificationRequest
     * <p>
     * Create dla classification request
     * (Required)
     * 
     */
    @JsonProperty("createDlaClassification")
    public CreateDlaClassification getCreateDlaClassification() {
        return createDlaClassification;
    }

    /**
     * CreateDlaClassificationRequest
     * <p>
     * Create dla classification request
     * (Required)
     * 
     */
    @JsonProperty("createDlaClassification")
    public void setCreateDlaClassification(CreateDlaClassification createDlaClassification) {
        this.createDlaClassification = createDlaClassification;
    }

    public LoadDlas withCreateDlaClassification(CreateDlaClassification createDlaClassification) {
        this.createDlaClassification = createDlaClassification;
        return this;
    }

    @JsonProperty("createDlas")
    public List<CreateDla> getCreateDlas() {
        return createDlas;
    }

    @JsonProperty("createDlas")
    public void setCreateDlas(List<CreateDla> createDlas) {
        this.createDlas = createDlas;
    }

    public LoadDlas withCreateDlas(List<CreateDla> createDlas) {
        this.createDlas = createDlas;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LoadDlas.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("createDlaClassification");
        sb.append('=');
        sb.append(((this.createDlaClassification == null)?"<null>":this.createDlaClassification));
        sb.append(',');
        sb.append("createDlas");
        sb.append('=');
        sb.append(((this.createDlas == null)?"<null>":this.createDlas));
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
        result = ((result* 31)+((this.createDlaClassification == null)? 0 :this.createDlaClassification.hashCode()));
        result = ((result* 31)+((this.createDlas == null)? 0 :this.createDlas.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadDlas) == false) {
            return false;
        }
        LoadDlas rhs = ((LoadDlas) other);
        return (((this.createDlaClassification == rhs.createDlaClassification)||((this.createDlaClassification!= null)&&this.createDlaClassification.equals(rhs.createDlaClassification)))&&((this.createDlas == rhs.createDlas)||((this.createDlas!= null)&&this.createDlas.equals(rhs.createDlas))));
    }

}
