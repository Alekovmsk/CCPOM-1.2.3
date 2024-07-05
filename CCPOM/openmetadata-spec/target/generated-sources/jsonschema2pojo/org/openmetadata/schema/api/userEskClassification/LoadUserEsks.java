
package org.openmetadata.schema.api.userEskClassification;

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
 * loadUserEsks
 * <p>
 * Load classifications and userEsks
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "createUserEskClassification",
    "createUserEsks"
})
@Generated("jsonschema2pojo")
public class LoadUserEsks {

    /**
     * CreateUserEskClassificationRequest
     * <p>
     * Create userEsk classification request
     * (Required)
     * 
     */
    @JsonProperty("createUserEskClassification")
    @JsonPropertyDescription("Create userEsk classification request")
    @Valid
    @NotNull
    private CreateUserEskClassification createUserEskClassification;
    @JsonProperty("createUserEsks")
    @Size(min = 1)
    @Valid
    private List<CreateUserEsk> createUserEsks = new ArrayList<CreateUserEsk>();

    /**
     * CreateUserEskClassificationRequest
     * <p>
     * Create userEsk classification request
     * (Required)
     * 
     */
    @JsonProperty("createUserEskClassification")
    public CreateUserEskClassification getCreateUserEskClassification() {
        return createUserEskClassification;
    }

    /**
     * CreateUserEskClassificationRequest
     * <p>
     * Create userEsk classification request
     * (Required)
     * 
     */
    @JsonProperty("createUserEskClassification")
    public void setCreateUserEskClassification(CreateUserEskClassification createUserEskClassification) {
        this.createUserEskClassification = createUserEskClassification;
    }

    public LoadUserEsks withCreateUserEskClassification(CreateUserEskClassification createUserEskClassification) {
        this.createUserEskClassification = createUserEskClassification;
        return this;
    }

    @JsonProperty("createUserEsks")
    public List<CreateUserEsk> getCreateUserEsks() {
        return createUserEsks;
    }

    @JsonProperty("createUserEsks")
    public void setCreateUserEsks(List<CreateUserEsk> createUserEsks) {
        this.createUserEsks = createUserEsks;
    }

    public LoadUserEsks withCreateUserEsks(List<CreateUserEsk> createUserEsks) {
        this.createUserEsks = createUserEsks;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LoadUserEsks.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("createUserEskClassification");
        sb.append('=');
        sb.append(((this.createUserEskClassification == null)?"<null>":this.createUserEskClassification));
        sb.append(',');
        sb.append("createUserEsks");
        sb.append('=');
        sb.append(((this.createUserEsks == null)?"<null>":this.createUserEsks));
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
        result = ((result* 31)+((this.createUserEskClassification == null)? 0 :this.createUserEskClassification.hashCode()));
        result = ((result* 31)+((this.createUserEsks == null)? 0 :this.createUserEsks.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadUserEsks) == false) {
            return false;
        }
        LoadUserEsks rhs = ((LoadUserEsks) other);
        return (((this.createUserEskClassification == rhs.createUserEskClassification)||((this.createUserEskClassification!= null)&&this.createUserEskClassification.equals(rhs.createUserEskClassification)))&&((this.createUserEsks == rhs.createUserEsks)||((this.createUserEsks!= null)&&this.createUserEsks.equals(rhs.createUserEsks))));
    }

}
