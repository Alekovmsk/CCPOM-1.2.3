
package org.openmetadata.schema.api.classification;

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
 * loadTags
 * <p>
 * Load classifications and tags
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "createClassification",
    "createTags"
})
@Generated("jsonschema2pojo")
public class LoadTags {

    /**
     * CreateClassificationRequest
     * <p>
     * Create classification request
     * (Required)
     * 
     */
    @JsonProperty("createClassification")
    @JsonPropertyDescription("Create classification request")
    @Valid
    @NotNull
    private CreateClassification createClassification;
    @JsonProperty("createTags")
    @Size(min = 1)
    @Valid
    private List<CreateTag> createTags = new ArrayList<CreateTag>();

    /**
     * CreateClassificationRequest
     * <p>
     * Create classification request
     * (Required)
     * 
     */
    @JsonProperty("createClassification")
    public CreateClassification getCreateClassification() {
        return createClassification;
    }

    /**
     * CreateClassificationRequest
     * <p>
     * Create classification request
     * (Required)
     * 
     */
    @JsonProperty("createClassification")
    public void setCreateClassification(CreateClassification createClassification) {
        this.createClassification = createClassification;
    }

    public LoadTags withCreateClassification(CreateClassification createClassification) {
        this.createClassification = createClassification;
        return this;
    }

    @JsonProperty("createTags")
    public List<CreateTag> getCreateTags() {
        return createTags;
    }

    @JsonProperty("createTags")
    public void setCreateTags(List<CreateTag> createTags) {
        this.createTags = createTags;
    }

    public LoadTags withCreateTags(List<CreateTag> createTags) {
        this.createTags = createTags;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LoadTags.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("createClassification");
        sb.append('=');
        sb.append(((this.createClassification == null)?"<null>":this.createClassification));
        sb.append(',');
        sb.append("createTags");
        sb.append('=');
        sb.append(((this.createTags == null)?"<null>":this.createTags));
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
        result = ((result* 31)+((this.createClassification == null)? 0 :this.createClassification.hashCode()));
        result = ((result* 31)+((this.createTags == null)? 0 :this.createTags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadTags) == false) {
            return false;
        }
        LoadTags rhs = ((LoadTags) other);
        return (((this.createClassification == rhs.createClassification)||((this.createClassification!= null)&&this.createClassification.equals(rhs.createClassification)))&&((this.createTags == rhs.createTags)||((this.createTags!= null)&&this.createTags.equals(rhs.createTags))));
    }

}
