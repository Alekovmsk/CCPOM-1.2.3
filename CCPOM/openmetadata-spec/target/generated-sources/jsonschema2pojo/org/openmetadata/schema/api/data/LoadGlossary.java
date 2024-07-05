
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
 * loadGlossary
 * <p>
 * Load a glossary
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "createGlossary",
    "createTerms"
})
@Generated("jsonschema2pojo")
public class LoadGlossary {

    /**
     * CreateGlossaryRequest
     * <p>
     * Create Glossary entity request
     * (Required)
     * 
     */
    @JsonProperty("createGlossary")
    @JsonPropertyDescription("Create Glossary entity request")
    @Valid
    @NotNull
    private CreateGlossary createGlossary;
    @JsonProperty("createTerms")
    @Size(min = 1)
    @Valid
    private List<CreateGlossaryTerm> createTerms = new ArrayList<CreateGlossaryTerm>();

    /**
     * CreateGlossaryRequest
     * <p>
     * Create Glossary entity request
     * (Required)
     * 
     */
    @JsonProperty("createGlossary")
    public CreateGlossary getCreateGlossary() {
        return createGlossary;
    }

    /**
     * CreateGlossaryRequest
     * <p>
     * Create Glossary entity request
     * (Required)
     * 
     */
    @JsonProperty("createGlossary")
    public void setCreateGlossary(CreateGlossary createGlossary) {
        this.createGlossary = createGlossary;
    }

    public LoadGlossary withCreateGlossary(CreateGlossary createGlossary) {
        this.createGlossary = createGlossary;
        return this;
    }

    @JsonProperty("createTerms")
    public List<CreateGlossaryTerm> getCreateTerms() {
        return createTerms;
    }

    @JsonProperty("createTerms")
    public void setCreateTerms(List<CreateGlossaryTerm> createTerms) {
        this.createTerms = createTerms;
    }

    public LoadGlossary withCreateTerms(List<CreateGlossaryTerm> createTerms) {
        this.createTerms = createTerms;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LoadGlossary.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("createGlossary");
        sb.append('=');
        sb.append(((this.createGlossary == null)?"<null>":this.createGlossary));
        sb.append(',');
        sb.append("createTerms");
        sb.append('=');
        sb.append(((this.createTerms == null)?"<null>":this.createTerms));
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
        result = ((result* 31)+((this.createGlossary == null)? 0 :this.createGlossary.hashCode()));
        result = ((result* 31)+((this.createTerms == null)? 0 :this.createTerms.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadGlossary) == false) {
            return false;
        }
        LoadGlossary rhs = ((LoadGlossary) other);
        return (((this.createGlossary == rhs.createGlossary)||((this.createGlossary!= null)&&this.createGlossary.equals(rhs.createGlossary)))&&((this.createTerms == rhs.createTerms)||((this.createTerms!= null)&&this.createTerms.equals(rhs.createTerms))));
    }

}
