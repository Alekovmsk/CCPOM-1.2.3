
package org.openmetadata.schema.auth.ldapTrustStoreConfig;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TrustAllConfig
 * <p>
 * TrustAll Configuration
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "examineValidityDates"
})
@Generated("jsonschema2pojo")
public class TrustAllConfig {

    /**
     * Examine validity dates of certificate
     * 
     */
    @JsonProperty("examineValidityDates")
    @JsonPropertyDescription("Examine validity dates of certificate")
    private Boolean examineValidityDates = false;

    /**
     * Examine validity dates of certificate
     * 
     */
    @JsonProperty("examineValidityDates")
    public Boolean getExamineValidityDates() {
        return examineValidityDates;
    }

    /**
     * Examine validity dates of certificate
     * 
     */
    @JsonProperty("examineValidityDates")
    public void setExamineValidityDates(Boolean examineValidityDates) {
        this.examineValidityDates = examineValidityDates;
    }

    public TrustAllConfig withExamineValidityDates(Boolean examineValidityDates) {
        this.examineValidityDates = examineValidityDates;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TrustAllConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("examineValidityDates");
        sb.append('=');
        sb.append(((this.examineValidityDates == null)?"<null>":this.examineValidityDates));
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
        result = ((result* 31)+((this.examineValidityDates == null)? 0 :this.examineValidityDates.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TrustAllConfig) == false) {
            return false;
        }
        TrustAllConfig rhs = ((TrustAllConfig) other);
        return ((this.examineValidityDates == rhs.examineValidityDates)||((this.examineValidityDates!= null)&&this.examineValidityDates.equals(rhs.examineValidityDates)));
    }

}
