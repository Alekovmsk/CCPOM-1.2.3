
package org.openmetadata.schema.type;

import java.net.URI;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Links to a list of images of varying resolutions/sizes.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "image",
    "image24",
    "image32",
    "image48",
    "image72",
    "image192",
    "image512"
})
@Generated("jsonschema2pojo")
public class ImageList {

    @JsonProperty("image")
    private URI image;
    @JsonProperty("image24")
    private URI image24;
    @JsonProperty("image32")
    private URI image32;
    @JsonProperty("image48")
    private URI image48;
    @JsonProperty("image72")
    private URI image72;
    @JsonProperty("image192")
    private URI image192;
    @JsonProperty("image512")
    private URI image512;

    @JsonProperty("image")
    public URI getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(URI image) {
        this.image = image;
    }

    public ImageList withImage(URI image) {
        this.image = image;
        return this;
    }

    @JsonProperty("image24")
    public URI getImage24() {
        return image24;
    }

    @JsonProperty("image24")
    public void setImage24(URI image24) {
        this.image24 = image24;
    }

    public ImageList withImage24(URI image24) {
        this.image24 = image24;
        return this;
    }

    @JsonProperty("image32")
    public URI getImage32() {
        return image32;
    }

    @JsonProperty("image32")
    public void setImage32(URI image32) {
        this.image32 = image32;
    }

    public ImageList withImage32(URI image32) {
        this.image32 = image32;
        return this;
    }

    @JsonProperty("image48")
    public URI getImage48() {
        return image48;
    }

    @JsonProperty("image48")
    public void setImage48(URI image48) {
        this.image48 = image48;
    }

    public ImageList withImage48(URI image48) {
        this.image48 = image48;
        return this;
    }

    @JsonProperty("image72")
    public URI getImage72() {
        return image72;
    }

    @JsonProperty("image72")
    public void setImage72(URI image72) {
        this.image72 = image72;
    }

    public ImageList withImage72(URI image72) {
        this.image72 = image72;
        return this;
    }

    @JsonProperty("image192")
    public URI getImage192() {
        return image192;
    }

    @JsonProperty("image192")
    public void setImage192(URI image192) {
        this.image192 = image192;
    }

    public ImageList withImage192(URI image192) {
        this.image192 = image192;
        return this;
    }

    @JsonProperty("image512")
    public URI getImage512() {
        return image512;
    }

    @JsonProperty("image512")
    public void setImage512(URI image512) {
        this.image512 = image512;
    }

    public ImageList withImage512(URI image512) {
        this.image512 = image512;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ImageList.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("image24");
        sb.append('=');
        sb.append(((this.image24 == null)?"<null>":this.image24));
        sb.append(',');
        sb.append("image32");
        sb.append('=');
        sb.append(((this.image32 == null)?"<null>":this.image32));
        sb.append(',');
        sb.append("image48");
        sb.append('=');
        sb.append(((this.image48 == null)?"<null>":this.image48));
        sb.append(',');
        sb.append("image72");
        sb.append('=');
        sb.append(((this.image72 == null)?"<null>":this.image72));
        sb.append(',');
        sb.append("image192");
        sb.append('=');
        sb.append(((this.image192 == null)?"<null>":this.image192));
        sb.append(',');
        sb.append("image512");
        sb.append('=');
        sb.append(((this.image512 == null)?"<null>":this.image512));
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
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        result = ((result* 31)+((this.image72 == null)? 0 :this.image72 .hashCode()));
        result = ((result* 31)+((this.image24 == null)? 0 :this.image24 .hashCode()));
        result = ((result* 31)+((this.image512 == null)? 0 :this.image512 .hashCode()));
        result = ((result* 31)+((this.image48 == null)? 0 :this.image48 .hashCode()));
        result = ((result* 31)+((this.image192 == null)? 0 :this.image192 .hashCode()));
        result = ((result* 31)+((this.image32 == null)? 0 :this.image32 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImageList) == false) {
            return false;
        }
        ImageList rhs = ((ImageList) other);
        return ((((((((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image)))&&((this.image72 == rhs.image72)||((this.image72 != null)&&this.image72 .equals(rhs.image72))))&&((this.image24 == rhs.image24)||((this.image24 != null)&&this.image24 .equals(rhs.image24))))&&((this.image512 == rhs.image512)||((this.image512 != null)&&this.image512 .equals(rhs.image512))))&&((this.image48 == rhs.image48)||((this.image48 != null)&&this.image48 .equals(rhs.image48))))&&((this.image192 == rhs.image192)||((this.image192 != null)&&this.image192 .equals(rhs.image192))))&&((this.image32 == rhs.image32)||((this.image32 != null)&&this.image32 .equals(rhs.image32))));
    }

}
