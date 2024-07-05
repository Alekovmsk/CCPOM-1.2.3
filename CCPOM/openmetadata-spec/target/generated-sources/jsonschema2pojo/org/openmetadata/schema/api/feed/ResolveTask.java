
package org.openmetadata.schema.api.feed;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ResolveTaskRequest
 * <p>
 * Resolve Task request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "newValue"
})
@Generated("jsonschema2pojo")
public class ResolveTask {

    /**
     * The new value object that needs to be updated to resolve the task.
     * (Required)
     * 
     */
    @JsonProperty("newValue")
    @JsonPropertyDescription("The new value object that needs to be updated to resolve the task.")
    @NotNull
    private String newValue;

    /**
     * The new value object that needs to be updated to resolve the task.
     * (Required)
     * 
     */
    @JsonProperty("newValue")
    public String getNewValue() {
        return newValue;
    }

    /**
     * The new value object that needs to be updated to resolve the task.
     * (Required)
     * 
     */
    @JsonProperty("newValue")
    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public ResolveTask withNewValue(String newValue) {
        this.newValue = newValue;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResolveTask.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("newValue");
        sb.append('=');
        sb.append(((this.newValue == null)?"<null>":this.newValue));
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
        result = ((result* 31)+((this.newValue == null)? 0 :this.newValue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResolveTask) == false) {
            return false;
        }
        ResolveTask rhs = ((ResolveTask) other);
        return ((this.newValue == rhs.newValue)||((this.newValue!= null)&&this.newValue.equals(rhs.newValue)));
    }

}
