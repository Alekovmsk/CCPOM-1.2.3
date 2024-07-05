
package org.openmetadata.schema.api.spdClassification;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "reqNumber",
    "reqDescription"
})
@Generated("jsonschema2pojo")
public class SpdRequirement {

    /**
     * Requirement number
     * 
     */
    @JsonProperty("reqNumber")
    @JsonPropertyDescription("Requirement number")
    private String reqNumber;
    /**
     * Requirement description
     * 
     */
    @JsonProperty("reqDescription")
    @JsonPropertyDescription("Requirement description")
    private String reqDescription;

    /**
     * Requirement number
     * 
     */
    @JsonProperty("reqNumber")
    public String getReqNumber() {
        return reqNumber;
    }

    /**
     * Requirement number
     * 
     */
    @JsonProperty("reqNumber")
    public void setReqNumber(String reqNumber) {
        this.reqNumber = reqNumber;
    }

    public SpdRequirement withReqNumber(String reqNumber) {
        this.reqNumber = reqNumber;
        return this;
    }

    /**
     * Requirement description
     * 
     */
    @JsonProperty("reqDescription")
    public String getReqDescription() {
        return reqDescription;
    }

    /**
     * Requirement description
     * 
     */
    @JsonProperty("reqDescription")
    public void setReqDescription(String reqDescription) {
        this.reqDescription = reqDescription;
    }

    public SpdRequirement withReqDescription(String reqDescription) {
        this.reqDescription = reqDescription;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SpdRequirement.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reqNumber");
        sb.append('=');
        sb.append(((this.reqNumber == null)?"<null>":this.reqNumber));
        sb.append(',');
        sb.append("reqDescription");
        sb.append('=');
        sb.append(((this.reqDescription == null)?"<null>":this.reqDescription));
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
        result = ((result* 31)+((this.reqDescription == null)? 0 :this.reqDescription.hashCode()));
        result = ((result* 31)+((this.reqNumber == null)? 0 :this.reqNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpdRequirement) == false) {
            return false;
        }
        SpdRequirement rhs = ((SpdRequirement) other);
        return (((this.reqDescription == rhs.reqDescription)||((this.reqDescription!= null)&&this.reqDescription.equals(rhs.reqDescription)))&&((this.reqNumber == rhs.reqNumber)||((this.reqNumber!= null)&&this.reqNumber.equals(rhs.reqNumber))));
    }

}
