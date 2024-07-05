
package org.openmetadata.schema.type;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CollectionDescriptor
 * <p>
 * Type used for capturing the details of a collection.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "collection"
})
@Generated("jsonschema2pojo")
public class CollectionDescriptor {

    /**
     * CollectionInfo
     * <p>
     * Collection Info.
     * 
     */
    @JsonProperty("collection")
    @JsonPropertyDescription("Collection Info.")
    @Valid
    private CollectionInfo collection;

    /**
     * CollectionInfo
     * <p>
     * Collection Info.
     * 
     */
    @JsonProperty("collection")
    public CollectionInfo getCollection() {
        return collection;
    }

    /**
     * CollectionInfo
     * <p>
     * Collection Info.
     * 
     */
    @JsonProperty("collection")
    public void setCollection(CollectionInfo collection) {
        this.collection = collection;
    }

    public CollectionDescriptor withCollection(CollectionInfo collection) {
        this.collection = collection;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CollectionDescriptor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("collection");
        sb.append('=');
        sb.append(((this.collection == null)?"<null>":this.collection));
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
        result = ((result* 31)+((this.collection == null)? 0 :this.collection.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CollectionDescriptor) == false) {
            return false;
        }
        CollectionDescriptor rhs = ((CollectionDescriptor) other);
        return ((this.collection == rhs.collection)||((this.collection!= null)&&this.collection.equals(rhs.collection)));
    }

}
