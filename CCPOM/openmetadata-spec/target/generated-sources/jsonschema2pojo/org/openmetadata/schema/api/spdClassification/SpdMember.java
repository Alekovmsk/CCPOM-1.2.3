
package org.openmetadata.schema.api.spdClassification;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "memberType",
    "memberNumber",
    "memberName",
    "memberShortName",
    "memberShortDescription",
    "memberOwner",
    "memberManager",
    "memberDomainAttribute",
    "memberDomainName",
    "memberDomainShortName",
    "memberDomainShortDescription",
    "memberDomainOwner",
    "memberDomainTechLeader"
})
@Generated("jsonschema2pojo")
public class SpdMember {

    /**
     * spdMember type
     * 
     */
    @JsonProperty("memberType")
    @JsonPropertyDescription("spdMember type")
    private String memberType;
    /**
     * spdMember number
     * 
     */
    @JsonProperty("memberNumber")
    @JsonPropertyDescription("spdMember number")
    private String memberNumber;
    /**
     * spdMember name
     * 
     */
    @JsonProperty("memberName")
    @JsonPropertyDescription("spdMember name")
    private String memberName;
    /**
     * spdMember short name
     * 
     */
    @JsonProperty("memberShortName")
    @JsonPropertyDescription("spdMember short name")
    private String memberShortName;
    /**
     * spdMember short name
     * 
     */
    @JsonProperty("memberShortDescription")
    @JsonPropertyDescription("spdMember short name")
    private String memberShortDescription;
    /**
     * spdMember Owner
     * 
     */
    @JsonProperty("memberOwner")
    @JsonPropertyDescription("spdMember Owner")
    private String memberOwner;
    /**
     * spdMember Manager
     * 
     */
    @JsonProperty("memberManager")
    @JsonPropertyDescription("spdMember Manager")
    private String memberManager;
    /**
     * spdMember Domain Attribute
     * 
     */
    @JsonProperty("memberDomainAttribute")
    @JsonPropertyDescription("spdMember Domain Attribute")
    private Boolean memberDomainAttribute = false;
    /**
     * member DomainName
     * 
     */
    @JsonProperty("memberDomainName")
    @JsonPropertyDescription("member DomainName")
    private String memberDomainName;
    /**
     * member Domain Short Name
     * 
     */
    @JsonProperty("memberDomainShortName")
    @JsonPropertyDescription("member Domain Short Name")
    private String memberDomainShortName;
    /**
     * member Domain Short Description
     * 
     */
    @JsonProperty("memberDomainShortDescription")
    @JsonPropertyDescription("member Domain Short Description")
    private String memberDomainShortDescription;
    /**
     * member Domain Owner
     * 
     */
    @JsonProperty("memberDomainOwner")
    @JsonPropertyDescription("member Domain Owner")
    private String memberDomainOwner;
    /**
     * member Domain Technical Leader
     * 
     */
    @JsonProperty("memberDomainTechLeader")
    @JsonPropertyDescription("member Domain Technical Leader")
    private String memberDomainTechLeader;

    /**
     * spdMember type
     * 
     */
    @JsonProperty("memberType")
    public String getMemberType() {
        return memberType;
    }

    /**
     * spdMember type
     * 
     */
    @JsonProperty("memberType")
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public SpdMember withMemberType(String memberType) {
        this.memberType = memberType;
        return this;
    }

    /**
     * spdMember number
     * 
     */
    @JsonProperty("memberNumber")
    public String getMemberNumber() {
        return memberNumber;
    }

    /**
     * spdMember number
     * 
     */
    @JsonProperty("memberNumber")
    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
    }

    public SpdMember withMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
        return this;
    }

    /**
     * spdMember name
     * 
     */
    @JsonProperty("memberName")
    public String getMemberName() {
        return memberName;
    }

    /**
     * spdMember name
     * 
     */
    @JsonProperty("memberName")
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public SpdMember withMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }

    /**
     * spdMember short name
     * 
     */
    @JsonProperty("memberShortName")
    public String getMemberShortName() {
        return memberShortName;
    }

    /**
     * spdMember short name
     * 
     */
    @JsonProperty("memberShortName")
    public void setMemberShortName(String memberShortName) {
        this.memberShortName = memberShortName;
    }

    public SpdMember withMemberShortName(String memberShortName) {
        this.memberShortName = memberShortName;
        return this;
    }

    /**
     * spdMember short name
     * 
     */
    @JsonProperty("memberShortDescription")
    public String getMemberShortDescription() {
        return memberShortDescription;
    }

    /**
     * spdMember short name
     * 
     */
    @JsonProperty("memberShortDescription")
    public void setMemberShortDescription(String memberShortDescription) {
        this.memberShortDescription = memberShortDescription;
    }

    public SpdMember withMemberShortDescription(String memberShortDescription) {
        this.memberShortDescription = memberShortDescription;
        return this;
    }

    /**
     * spdMember Owner
     * 
     */
    @JsonProperty("memberOwner")
    public String getMemberOwner() {
        return memberOwner;
    }

    /**
     * spdMember Owner
     * 
     */
    @JsonProperty("memberOwner")
    public void setMemberOwner(String memberOwner) {
        this.memberOwner = memberOwner;
    }

    public SpdMember withMemberOwner(String memberOwner) {
        this.memberOwner = memberOwner;
        return this;
    }

    /**
     * spdMember Manager
     * 
     */
    @JsonProperty("memberManager")
    public String getMemberManager() {
        return memberManager;
    }

    /**
     * spdMember Manager
     * 
     */
    @JsonProperty("memberManager")
    public void setMemberManager(String memberManager) {
        this.memberManager = memberManager;
    }

    public SpdMember withMemberManager(String memberManager) {
        this.memberManager = memberManager;
        return this;
    }

    /**
     * spdMember Domain Attribute
     * 
     */
    @JsonProperty("memberDomainAttribute")
    public Boolean getMemberDomainAttribute() {
        return memberDomainAttribute;
    }

    /**
     * spdMember Domain Attribute
     * 
     */
    @JsonProperty("memberDomainAttribute")
    public void setMemberDomainAttribute(Boolean memberDomainAttribute) {
        this.memberDomainAttribute = memberDomainAttribute;
    }

    public SpdMember withMemberDomainAttribute(Boolean memberDomainAttribute) {
        this.memberDomainAttribute = memberDomainAttribute;
        return this;
    }

    /**
     * member DomainName
     * 
     */
    @JsonProperty("memberDomainName")
    public String getMemberDomainName() {
        return memberDomainName;
    }

    /**
     * member DomainName
     * 
     */
    @JsonProperty("memberDomainName")
    public void setMemberDomainName(String memberDomainName) {
        this.memberDomainName = memberDomainName;
    }

    public SpdMember withMemberDomainName(String memberDomainName) {
        this.memberDomainName = memberDomainName;
        return this;
    }

    /**
     * member Domain Short Name
     * 
     */
    @JsonProperty("memberDomainShortName")
    public String getMemberDomainShortName() {
        return memberDomainShortName;
    }

    /**
     * member Domain Short Name
     * 
     */
    @JsonProperty("memberDomainShortName")
    public void setMemberDomainShortName(String memberDomainShortName) {
        this.memberDomainShortName = memberDomainShortName;
    }

    public SpdMember withMemberDomainShortName(String memberDomainShortName) {
        this.memberDomainShortName = memberDomainShortName;
        return this;
    }

    /**
     * member Domain Short Description
     * 
     */
    @JsonProperty("memberDomainShortDescription")
    public String getMemberDomainShortDescription() {
        return memberDomainShortDescription;
    }

    /**
     * member Domain Short Description
     * 
     */
    @JsonProperty("memberDomainShortDescription")
    public void setMemberDomainShortDescription(String memberDomainShortDescription) {
        this.memberDomainShortDescription = memberDomainShortDescription;
    }

    public SpdMember withMemberDomainShortDescription(String memberDomainShortDescription) {
        this.memberDomainShortDescription = memberDomainShortDescription;
        return this;
    }

    /**
     * member Domain Owner
     * 
     */
    @JsonProperty("memberDomainOwner")
    public String getMemberDomainOwner() {
        return memberDomainOwner;
    }

    /**
     * member Domain Owner
     * 
     */
    @JsonProperty("memberDomainOwner")
    public void setMemberDomainOwner(String memberDomainOwner) {
        this.memberDomainOwner = memberDomainOwner;
    }

    public SpdMember withMemberDomainOwner(String memberDomainOwner) {
        this.memberDomainOwner = memberDomainOwner;
        return this;
    }

    /**
     * member Domain Technical Leader
     * 
     */
    @JsonProperty("memberDomainTechLeader")
    public String getMemberDomainTechLeader() {
        return memberDomainTechLeader;
    }

    /**
     * member Domain Technical Leader
     * 
     */
    @JsonProperty("memberDomainTechLeader")
    public void setMemberDomainTechLeader(String memberDomainTechLeader) {
        this.memberDomainTechLeader = memberDomainTechLeader;
    }

    public SpdMember withMemberDomainTechLeader(String memberDomainTechLeader) {
        this.memberDomainTechLeader = memberDomainTechLeader;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SpdMember.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("memberType");
        sb.append('=');
        sb.append(((this.memberType == null)?"<null>":this.memberType));
        sb.append(',');
        sb.append("memberNumber");
        sb.append('=');
        sb.append(((this.memberNumber == null)?"<null>":this.memberNumber));
        sb.append(',');
        sb.append("memberName");
        sb.append('=');
        sb.append(((this.memberName == null)?"<null>":this.memberName));
        sb.append(',');
        sb.append("memberShortName");
        sb.append('=');
        sb.append(((this.memberShortName == null)?"<null>":this.memberShortName));
        sb.append(',');
        sb.append("memberShortDescription");
        sb.append('=');
        sb.append(((this.memberShortDescription == null)?"<null>":this.memberShortDescription));
        sb.append(',');
        sb.append("memberOwner");
        sb.append('=');
        sb.append(((this.memberOwner == null)?"<null>":this.memberOwner));
        sb.append(',');
        sb.append("memberManager");
        sb.append('=');
        sb.append(((this.memberManager == null)?"<null>":this.memberManager));
        sb.append(',');
        sb.append("memberDomainAttribute");
        sb.append('=');
        sb.append(((this.memberDomainAttribute == null)?"<null>":this.memberDomainAttribute));
        sb.append(',');
        sb.append("memberDomainName");
        sb.append('=');
        sb.append(((this.memberDomainName == null)?"<null>":this.memberDomainName));
        sb.append(',');
        sb.append("memberDomainShortName");
        sb.append('=');
        sb.append(((this.memberDomainShortName == null)?"<null>":this.memberDomainShortName));
        sb.append(',');
        sb.append("memberDomainShortDescription");
        sb.append('=');
        sb.append(((this.memberDomainShortDescription == null)?"<null>":this.memberDomainShortDescription));
        sb.append(',');
        sb.append("memberDomainOwner");
        sb.append('=');
        sb.append(((this.memberDomainOwner == null)?"<null>":this.memberDomainOwner));
        sb.append(',');
        sb.append("memberDomainTechLeader");
        sb.append('=');
        sb.append(((this.memberDomainTechLeader == null)?"<null>":this.memberDomainTechLeader));
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
        result = ((result* 31)+((this.memberDomainShortName == null)? 0 :this.memberDomainShortName.hashCode()));
        result = ((result* 31)+((this.memberDomainTechLeader == null)? 0 :this.memberDomainTechLeader.hashCode()));
        result = ((result* 31)+((this.memberOwner == null)? 0 :this.memberOwner.hashCode()));
        result = ((result* 31)+((this.memberDomainAttribute == null)? 0 :this.memberDomainAttribute.hashCode()));
        result = ((result* 31)+((this.memberName == null)? 0 :this.memberName.hashCode()));
        result = ((result* 31)+((this.memberNumber == null)? 0 :this.memberNumber.hashCode()));
        result = ((result* 31)+((this.memberDomainOwner == null)? 0 :this.memberDomainOwner.hashCode()));
        result = ((result* 31)+((this.memberDomainName == null)? 0 :this.memberDomainName.hashCode()));
        result = ((result* 31)+((this.memberShortDescription == null)? 0 :this.memberShortDescription.hashCode()));
        result = ((result* 31)+((this.memberManager == null)? 0 :this.memberManager.hashCode()));
        result = ((result* 31)+((this.memberShortName == null)? 0 :this.memberShortName.hashCode()));
        result = ((result* 31)+((this.memberDomainShortDescription == null)? 0 :this.memberDomainShortDescription.hashCode()));
        result = ((result* 31)+((this.memberType == null)? 0 :this.memberType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpdMember) == false) {
            return false;
        }
        SpdMember rhs = ((SpdMember) other);
        return ((((((((((((((this.memberDomainShortName == rhs.memberDomainShortName)||((this.memberDomainShortName!= null)&&this.memberDomainShortName.equals(rhs.memberDomainShortName)))&&((this.memberDomainTechLeader == rhs.memberDomainTechLeader)||((this.memberDomainTechLeader!= null)&&this.memberDomainTechLeader.equals(rhs.memberDomainTechLeader))))&&((this.memberOwner == rhs.memberOwner)||((this.memberOwner!= null)&&this.memberOwner.equals(rhs.memberOwner))))&&((this.memberDomainAttribute == rhs.memberDomainAttribute)||((this.memberDomainAttribute!= null)&&this.memberDomainAttribute.equals(rhs.memberDomainAttribute))))&&((this.memberName == rhs.memberName)||((this.memberName!= null)&&this.memberName.equals(rhs.memberName))))&&((this.memberNumber == rhs.memberNumber)||((this.memberNumber!= null)&&this.memberNumber.equals(rhs.memberNumber))))&&((this.memberDomainOwner == rhs.memberDomainOwner)||((this.memberDomainOwner!= null)&&this.memberDomainOwner.equals(rhs.memberDomainOwner))))&&((this.memberDomainName == rhs.memberDomainName)||((this.memberDomainName!= null)&&this.memberDomainName.equals(rhs.memberDomainName))))&&((this.memberShortDescription == rhs.memberShortDescription)||((this.memberShortDescription!= null)&&this.memberShortDescription.equals(rhs.memberShortDescription))))&&((this.memberManager == rhs.memberManager)||((this.memberManager!= null)&&this.memberManager.equals(rhs.memberManager))))&&((this.memberShortName == rhs.memberShortName)||((this.memberShortName!= null)&&this.memberShortName.equals(rhs.memberShortName))))&&((this.memberDomainShortDescription == rhs.memberDomainShortDescription)||((this.memberDomainShortDescription!= null)&&this.memberDomainShortDescription.equals(rhs.memberDomainShortDescription))))&&((this.memberType == rhs.memberType)||((this.memberType!= null)&&this.memberType.equals(rhs.memberType))));
    }

}
