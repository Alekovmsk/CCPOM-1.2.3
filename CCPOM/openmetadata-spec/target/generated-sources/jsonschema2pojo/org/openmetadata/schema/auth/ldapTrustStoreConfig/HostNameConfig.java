
package org.openmetadata.schema.auth.ldapTrustStoreConfig;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * HostNameConfig
 * <p>
 * HostName Configuration
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "allowWildCards",
    "acceptableHostNames"
})
@Generated("jsonschema2pojo")
public class HostNameConfig {

    /**
     * Allow wildcards
     * 
     */
    @JsonProperty("allowWildCards")
    @JsonPropertyDescription("Allow wildcards")
    private Boolean allowWildCards = false;
    /**
     * list of acceptable host names
     * 
     */
    @JsonProperty("acceptableHostNames")
    @JsonPropertyDescription("list of acceptable host names")
    @Valid
    private List<String> acceptableHostNames = new ArrayList<String>();

    /**
     * Allow wildcards
     * 
     */
    @JsonProperty("allowWildCards")
    public Boolean getAllowWildCards() {
        return allowWildCards;
    }

    /**
     * Allow wildcards
     * 
     */
    @JsonProperty("allowWildCards")
    public void setAllowWildCards(Boolean allowWildCards) {
        this.allowWildCards = allowWildCards;
    }

    public HostNameConfig withAllowWildCards(Boolean allowWildCards) {
        this.allowWildCards = allowWildCards;
        return this;
    }

    /**
     * list of acceptable host names
     * 
     */
    @JsonProperty("acceptableHostNames")
    public List<String> getAcceptableHostNames() {
        return acceptableHostNames;
    }

    /**
     * list of acceptable host names
     * 
     */
    @JsonProperty("acceptableHostNames")
    public void setAcceptableHostNames(List<String> acceptableHostNames) {
        this.acceptableHostNames = acceptableHostNames;
    }

    public HostNameConfig withAcceptableHostNames(List<String> acceptableHostNames) {
        this.acceptableHostNames = acceptableHostNames;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HostNameConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("allowWildCards");
        sb.append('=');
        sb.append(((this.allowWildCards == null)?"<null>":this.allowWildCards));
        sb.append(',');
        sb.append("acceptableHostNames");
        sb.append('=');
        sb.append(((this.acceptableHostNames == null)?"<null>":this.acceptableHostNames));
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
        result = ((result* 31)+((this.allowWildCards == null)? 0 :this.allowWildCards.hashCode()));
        result = ((result* 31)+((this.acceptableHostNames == null)? 0 :this.acceptableHostNames.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HostNameConfig) == false) {
            return false;
        }
        HostNameConfig rhs = ((HostNameConfig) other);
        return (((this.allowWildCards == rhs.allowWildCards)||((this.allowWildCards!= null)&&this.allowWildCards.equals(rhs.allowWildCards)))&&((this.acceptableHostNames == rhs.acceptableHostNames)||((this.acceptableHostNames!= null)&&this.acceptableHostNames.equals(rhs.acceptableHostNames))));
    }

}
