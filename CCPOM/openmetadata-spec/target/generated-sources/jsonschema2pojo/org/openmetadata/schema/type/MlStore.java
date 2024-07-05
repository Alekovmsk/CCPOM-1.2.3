
package org.openmetadata.schema.type;

import java.net.URI;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Location containing the ML Model. It can be a storage layer and/or a container repository.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "storage",
    "imageRepository"
})
@Generated("jsonschema2pojo")
public class MlStore {

    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("storage")
    @JsonPropertyDescription("URI that points to a resource.")
    private URI storage;
    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("imageRepository")
    @JsonPropertyDescription("URI that points to a resource.")
    private URI imageRepository;

    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("storage")
    public URI getStorage() {
        return storage;
    }

    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("storage")
    public void setStorage(URI storage) {
        this.storage = storage;
    }

    public MlStore withStorage(URI storage) {
        this.storage = storage;
        return this;
    }

    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("imageRepository")
    public URI getImageRepository() {
        return imageRepository;
    }

    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("imageRepository")
    public void setImageRepository(URI imageRepository) {
        this.imageRepository = imageRepository;
    }

    public MlStore withImageRepository(URI imageRepository) {
        this.imageRepository = imageRepository;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MlStore.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("storage");
        sb.append('=');
        sb.append(((this.storage == null)?"<null>":this.storage));
        sb.append(',');
        sb.append("imageRepository");
        sb.append('=');
        sb.append(((this.imageRepository == null)?"<null>":this.imageRepository));
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
        result = ((result* 31)+((this.imageRepository == null)? 0 :this.imageRepository.hashCode()));
        result = ((result* 31)+((this.storage == null)? 0 :this.storage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MlStore) == false) {
            return false;
        }
        MlStore rhs = ((MlStore) other);
        return (((this.imageRepository == rhs.imageRepository)||((this.imageRepository!= null)&&this.imageRepository.equals(rhs.imageRepository)))&&((this.storage == rhs.storage)||((this.storage!= null)&&this.storage.equals(rhs.storage))));
    }

}
