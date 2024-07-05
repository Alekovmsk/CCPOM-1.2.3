
package org.openmetadata.schema.type;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Additional Context
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data"
})
@Generated("jsonschema2pojo")
public class ParamAdditionalContext {

    /**
     * List of Entities
     * 
     */
    @JsonProperty("data")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("List of Entities")
    @Valid
    private Set<String> data = new LinkedHashSet<String>();

    /**
     * List of Entities
     * 
     */
    @JsonProperty("data")
    public Set<String> getData() {
        return data;
    }

    /**
     * List of Entities
     * 
     */
    @JsonProperty("data")
    public void setData(Set<String> data) {
        this.data = data;
    }

    public ParamAdditionalContext withData(Set<String> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ParamAdditionalContext.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
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
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ParamAdditionalContext) == false) {
            return false;
        }
        ParamAdditionalContext rhs = ((ParamAdditionalContext) other);
        return ((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data)));
    }

}
