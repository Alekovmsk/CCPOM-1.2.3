
package org.openmetadata.schema.api.fernet;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FernetConfiguration
 * <p>
 * This schema defines the Fernet Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fernetKey"
})
@Generated("jsonschema2pojo")
public class FernetConfiguration {

    /**
     * Fernet Key
     * (Required)
     * 
     */
    @JsonProperty("fernetKey")
    @JsonPropertyDescription("Fernet Key")
    @NotNull
    private String fernetKey;

    /**
     * Fernet Key
     * (Required)
     * 
     */
    @JsonProperty("fernetKey")
    public String getFernetKey() {
        return fernetKey;
    }

    /**
     * Fernet Key
     * (Required)
     * 
     */
    @JsonProperty("fernetKey")
    public void setFernetKey(String fernetKey) {
        this.fernetKey = fernetKey;
    }

    public FernetConfiguration withFernetKey(String fernetKey) {
        this.fernetKey = fernetKey;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FernetConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fernetKey");
        sb.append('=');
        sb.append(((this.fernetKey == null)?"<null>":this.fernetKey));
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
        result = ((result* 31)+((this.fernetKey == null)? 0 :this.fernetKey.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FernetConfiguration) == false) {
            return false;
        }
        FernetConfiguration rhs = ((FernetConfiguration) other);
        return ((this.fernetKey == rhs.fernetKey)||((this.fernetKey!= null)&&this.fernetKey.equals(rhs.fernetKey)));
    }

}
