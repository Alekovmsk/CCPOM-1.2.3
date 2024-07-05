
package org.openmetadata.api.configuration;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ChangeEventConfiguration
 * <p>
 * This schema defines the ChangeEvent Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "omUri"
})
@Generated("jsonschema2pojo")
public class ChangeEventConfiguration {

    @JsonProperty("omUri")
    private String omUri;

    @JsonProperty("omUri")
    public String getOmUri() {
        return omUri;
    }

    @JsonProperty("omUri")
    public void setOmUri(String omUri) {
        this.omUri = omUri;
    }

    public ChangeEventConfiguration withOmUri(String omUri) {
        this.omUri = omUri;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChangeEventConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("omUri");
        sb.append('=');
        sb.append(((this.omUri == null)?"<null>":this.omUri));
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
        result = ((result* 31)+((this.omUri == null)? 0 :this.omUri.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChangeEventConfiguration) == false) {
            return false;
        }
        ChangeEventConfiguration rhs = ((ChangeEventConfiguration) other);
        return ((this.omUri == rhs.omUri)||((this.omUri!= null)&&this.omUri.equals(rhs.omUri)));
    }

}
