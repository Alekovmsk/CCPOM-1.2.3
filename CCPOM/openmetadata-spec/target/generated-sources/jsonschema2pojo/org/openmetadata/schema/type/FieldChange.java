
package org.openmetadata.schema.type;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "oldValue",
    "newValue"
})
@Generated("jsonschema2pojo")
public class FieldChange {

    /**
     * Name of the field of an entity.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the field of an entity.")
    private String name;
    /**
     * Previous value of the field. Note that this is a JSON string and use the corresponding field type to deserialize it.
     * 
     */
    @JsonProperty("oldValue")
    @JsonPropertyDescription("Previous value of the field. Note that this is a JSON string and use the corresponding field type to deserialize it.")
    private Object oldValue;
    /**
     * New value of the field. Note that this is a JSON string and use the corresponding field type to deserialize it.
     * 
     */
    @JsonProperty("newValue")
    @JsonPropertyDescription("New value of the field. Note that this is a JSON string and use the corresponding field type to deserialize it.")
    private Object newValue;

    /**
     * Name of the field of an entity.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the field of an entity.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public FieldChange withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Previous value of the field. Note that this is a JSON string and use the corresponding field type to deserialize it.
     * 
     */
    @JsonProperty("oldValue")
    public Object getOldValue() {
        return oldValue;
    }

    /**
     * Previous value of the field. Note that this is a JSON string and use the corresponding field type to deserialize it.
     * 
     */
    @JsonProperty("oldValue")
    public void setOldValue(Object oldValue) {
        this.oldValue = oldValue;
    }

    public FieldChange withOldValue(Object oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    /**
     * New value of the field. Note that this is a JSON string and use the corresponding field type to deserialize it.
     * 
     */
    @JsonProperty("newValue")
    public Object getNewValue() {
        return newValue;
    }

    /**
     * New value of the field. Note that this is a JSON string and use the corresponding field type to deserialize it.
     * 
     */
    @JsonProperty("newValue")
    public void setNewValue(Object newValue) {
        this.newValue = newValue;
    }

    public FieldChange withNewValue(Object newValue) {
        this.newValue = newValue;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FieldChange.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("oldValue");
        sb.append('=');
        sb.append(((this.oldValue == null)?"<null>":this.oldValue));
        sb.append(',');
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.newValue == null)? 0 :this.newValue.hashCode()));
        result = ((result* 31)+((this.oldValue == null)? 0 :this.oldValue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FieldChange) == false) {
            return false;
        }
        FieldChange rhs = ((FieldChange) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.newValue == rhs.newValue)||((this.newValue!= null)&&this.newValue.equals(rhs.newValue))))&&((this.oldValue == rhs.oldValue)||((this.oldValue!= null)&&this.oldValue.equals(rhs.oldValue))));
    }

}
