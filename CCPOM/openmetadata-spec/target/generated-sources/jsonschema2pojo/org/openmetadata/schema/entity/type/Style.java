
package org.openmetadata.schema.entity.type;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "color",
    "iconURL"
})
@Generated("jsonschema2pojo")
public class Style {

    /**
     * Hex Color Code to mark an entity such as GlossaryTerm, Tag, Domain or Data Product.
     * 
     */
    @JsonProperty("color")
    @JsonPropertyDescription("Hex Color Code to mark an entity such as GlossaryTerm, Tag, Domain or Data Product.")
    private String color;
    /**
     * An icon to associate with GlossaryTerm, Tag, Domain or Data Product.
     * 
     */
    @JsonProperty("iconURL")
    @JsonPropertyDescription("An icon to associate with GlossaryTerm, Tag, Domain or Data Product.")
    private String iconURL;

    /**
     * Hex Color Code to mark an entity such as GlossaryTerm, Tag, Domain or Data Product.
     * 
     */
    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    /**
     * Hex Color Code to mark an entity such as GlossaryTerm, Tag, Domain or Data Product.
     * 
     */
    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    public Style withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * An icon to associate with GlossaryTerm, Tag, Domain or Data Product.
     * 
     */
    @JsonProperty("iconURL")
    public String getIconURL() {
        return iconURL;
    }

    /**
     * An icon to associate with GlossaryTerm, Tag, Domain or Data Product.
     * 
     */
    @JsonProperty("iconURL")
    public void setIconURL(String iconURL) {
        this.iconURL = iconURL;
    }

    public Style withIconURL(String iconURL) {
        this.iconURL = iconURL;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Style.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("color");
        sb.append('=');
        sb.append(((this.color == null)?"<null>":this.color));
        sb.append(',');
        sb.append("iconURL");
        sb.append('=');
        sb.append(((this.iconURL == null)?"<null>":this.iconURL));
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
        result = ((result* 31)+((this.color == null)? 0 :this.color.hashCode()));
        result = ((result* 31)+((this.iconURL == null)? 0 :this.iconURL.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Style) == false) {
            return false;
        }
        Style rhs = ((Style) other);
        return (((this.color == rhs.color)||((this.color!= null)&&this.color.equals(rhs.color)))&&((this.iconURL == rhs.iconURL)||((this.iconURL!= null)&&this.iconURL.equals(rhs.iconURL))));
    }

}
