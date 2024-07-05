
package org.openmetadata.schema.api.domains;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "elNumber",
    "fullName",
    "ssp",
    "role",
    "responseArea"
})
@Generated("jsonschema2pojo")
public class DomainTeamMember {

    /**
     * Team member number
     * 
     */
    @JsonProperty("elNumber")
    @JsonPropertyDescription("Team member number")
    private String elNumber;
    /**
     * Team member full name
     * 
     */
    @JsonProperty("fullName")
    @JsonPropertyDescription("Team member full name")
    private String fullName;
    /**
     * ssp
     * 
     */
    @JsonProperty("ssp")
    @JsonPropertyDescription("ssp")
    private String ssp;
    /**
     * Team member role
     * 
     */
    @JsonProperty("role")
    @JsonPropertyDescription("Team member role")
    private String role;
    /**
     * Area of responsibility
     * 
     */
    @JsonProperty("responseArea")
    @JsonPropertyDescription("Area of responsibility")
    private String responseArea;

    /**
     * Team member number
     * 
     */
    @JsonProperty("elNumber")
    public String getElNumber() {
        return elNumber;
    }

    /**
     * Team member number
     * 
     */
    @JsonProperty("elNumber")
    public void setElNumber(String elNumber) {
        this.elNumber = elNumber;
    }

    public DomainTeamMember withElNumber(String elNumber) {
        this.elNumber = elNumber;
        return this;
    }

    /**
     * Team member full name
     * 
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * Team member full name
     * 
     */
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public DomainTeamMember withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * ssp
     * 
     */
    @JsonProperty("ssp")
    public String getSsp() {
        return ssp;
    }

    /**
     * ssp
     * 
     */
    @JsonProperty("ssp")
    public void setSsp(String ssp) {
        this.ssp = ssp;
    }

    public DomainTeamMember withSsp(String ssp) {
        this.ssp = ssp;
        return this;
    }

    /**
     * Team member role
     * 
     */
    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    /**
     * Team member role
     * 
     */
    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    public DomainTeamMember withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * Area of responsibility
     * 
     */
    @JsonProperty("responseArea")
    public String getResponseArea() {
        return responseArea;
    }

    /**
     * Area of responsibility
     * 
     */
    @JsonProperty("responseArea")
    public void setResponseArea(String responseArea) {
        this.responseArea = responseArea;
    }

    public DomainTeamMember withResponseArea(String responseArea) {
        this.responseArea = responseArea;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DomainTeamMember.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("elNumber");
        sb.append('=');
        sb.append(((this.elNumber == null)?"<null>":this.elNumber));
        sb.append(',');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("ssp");
        sb.append('=');
        sb.append(((this.ssp == null)?"<null>":this.ssp));
        sb.append(',');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
        sb.append(',');
        sb.append("responseArea");
        sb.append('=');
        sb.append(((this.responseArea == null)?"<null>":this.responseArea));
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
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.ssp == null)? 0 :this.ssp.hashCode()));
        result = ((result* 31)+((this.role == null)? 0 :this.role.hashCode()));
        result = ((result* 31)+((this.elNumber == null)? 0 :this.elNumber.hashCode()));
        result = ((result* 31)+((this.responseArea == null)? 0 :this.responseArea.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DomainTeamMember) == false) {
            return false;
        }
        DomainTeamMember rhs = ((DomainTeamMember) other);
        return ((((((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName)))&&((this.ssp == rhs.ssp)||((this.ssp!= null)&&this.ssp.equals(rhs.ssp))))&&((this.role == rhs.role)||((this.role!= null)&&this.role.equals(rhs.role))))&&((this.elNumber == rhs.elNumber)||((this.elNumber!= null)&&this.elNumber.equals(rhs.elNumber))))&&((this.responseArea == rhs.responseArea)||((this.responseArea!= null)&&this.responseArea.equals(rhs.responseArea))));
    }

}
