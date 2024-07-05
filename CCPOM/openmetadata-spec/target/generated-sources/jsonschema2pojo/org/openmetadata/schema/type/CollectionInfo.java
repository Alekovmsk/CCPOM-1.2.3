
package org.openmetadata.schema.type;

import java.net.URI;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CollectionInfo
 * <p>
 * Collection Info.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "documentation",
    "href",
    "images"
})
@Generated("jsonschema2pojo")
public class CollectionInfo {

    /**
     * Unique name that identifies a collection.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Unique name that identifies a collection.")
    private String name;
    /**
     * Description of collection.
     * 
     */
    @JsonProperty("documentation")
    @JsonPropertyDescription("Description of collection.")
    private String documentation;
    /**
     * URL of the API endpoint where given collections are available.
     * 
     */
    @JsonProperty("href")
    @JsonPropertyDescription("URL of the API endpoint where given collections are available.")
    private URI href;
    /**
     * Links to a list of images of varying resolutions/sizes.
     * 
     */
    @JsonProperty("images")
    @JsonPropertyDescription("Links to a list of images of varying resolutions/sizes.")
    @Valid
    private ImageList images;

    /**
     * Unique name that identifies a collection.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Unique name that identifies a collection.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CollectionInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Description of collection.
     * 
     */
    @JsonProperty("documentation")
    public String getDocumentation() {
        return documentation;
    }

    /**
     * Description of collection.
     * 
     */
    @JsonProperty("documentation")
    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public CollectionInfo withDocumentation(String documentation) {
        this.documentation = documentation;
        return this;
    }

    /**
     * URL of the API endpoint where given collections are available.
     * 
     */
    @JsonProperty("href")
    public URI getHref() {
        return href;
    }

    /**
     * URL of the API endpoint where given collections are available.
     * 
     */
    @JsonProperty("href")
    public void setHref(URI href) {
        this.href = href;
    }

    public CollectionInfo withHref(URI href) {
        this.href = href;
        return this;
    }

    /**
     * Links to a list of images of varying resolutions/sizes.
     * 
     */
    @JsonProperty("images")
    public ImageList getImages() {
        return images;
    }

    /**
     * Links to a list of images of varying resolutions/sizes.
     * 
     */
    @JsonProperty("images")
    public void setImages(ImageList images) {
        this.images = images;
    }

    public CollectionInfo withImages(ImageList images) {
        this.images = images;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CollectionInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("documentation");
        sb.append('=');
        sb.append(((this.documentation == null)?"<null>":this.documentation));
        sb.append(',');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
        sb.append(',');
        sb.append("images");
        sb.append('=');
        sb.append(((this.images == null)?"<null>":this.images));
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
        result = ((result* 31)+((this.images == null)? 0 :this.images.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.documentation == null)? 0 :this.documentation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CollectionInfo) == false) {
            return false;
        }
        CollectionInfo rhs = ((CollectionInfo) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.images == rhs.images)||((this.images!= null)&&this.images.equals(rhs.images))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.documentation == rhs.documentation)||((this.documentation!= null)&&this.documentation.equals(rhs.documentation))));
    }

}
