
package org.openmetadata.schema.metadataIngestion;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Regex to only fetch dashboards or charts that matches the pattern.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "includes",
    "excludes"
})
@Generated("jsonschema2pojo")
public class FilterPattern {

    /**
     * List of strings/regex patterns to match and include only database entities that match.
     * 
     */
    @JsonProperty("includes")
    @JsonPropertyDescription("List of strings/regex patterns to match and include only database entities that match.")
    @Valid
    private List<String> includes = new ArrayList<String>();
    /**
     * List of strings/regex patterns to match and exclude only database entities that match.
     * 
     */
    @JsonProperty("excludes")
    @JsonPropertyDescription("List of strings/regex patterns to match and exclude only database entities that match.")
    @Valid
    private List<String> excludes = new ArrayList<String>();

    /**
     * List of strings/regex patterns to match and include only database entities that match.
     * 
     */
    @JsonProperty("includes")
    public List<String> getIncludes() {
        return includes;
    }

    /**
     * List of strings/regex patterns to match and include only database entities that match.
     * 
     */
    @JsonProperty("includes")
    public void setIncludes(List<String> includes) {
        this.includes = includes;
    }

    public FilterPattern withIncludes(List<String> includes) {
        this.includes = includes;
        return this;
    }

    /**
     * List of strings/regex patterns to match and exclude only database entities that match.
     * 
     */
    @JsonProperty("excludes")
    public List<String> getExcludes() {
        return excludes;
    }

    /**
     * List of strings/regex patterns to match and exclude only database entities that match.
     * 
     */
    @JsonProperty("excludes")
    public void setExcludes(List<String> excludes) {
        this.excludes = excludes;
    }

    public FilterPattern withExcludes(List<String> excludes) {
        this.excludes = excludes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FilterPattern.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("includes");
        sb.append('=');
        sb.append(((this.includes == null)?"<null>":this.includes));
        sb.append(',');
        sb.append("excludes");
        sb.append('=');
        sb.append(((this.excludes == null)?"<null>":this.excludes));
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
        result = ((result* 31)+((this.includes == null)? 0 :this.includes.hashCode()));
        result = ((result* 31)+((this.excludes == null)? 0 :this.excludes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FilterPattern) == false) {
            return false;
        }
        FilterPattern rhs = ((FilterPattern) other);
        return (((this.includes == rhs.includes)||((this.includes!= null)&&this.includes.equals(rhs.includes)))&&((this.excludes == rhs.excludes)||((this.excludes!= null)&&this.excludes.equals(rhs.excludes))));
    }

}
