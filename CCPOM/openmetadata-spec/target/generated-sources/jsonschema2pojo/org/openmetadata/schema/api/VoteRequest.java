
package org.openmetadata.schema.api;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Query Vote
 * <p>
 * This schema defines Services Count. This contains aggregated services count.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "updatedVoteType"
})
@Generated("jsonschema2pojo")
public class VoteRequest {

    /**
     * Vote Type
     * 
     */
    @JsonProperty("updatedVoteType")
    @JsonPropertyDescription("Vote Type")
    private VoteRequest.VoteType updatedVoteType = VoteRequest.VoteType.fromValue("unVoted");

    /**
     * Vote Type
     * 
     */
    @JsonProperty("updatedVoteType")
    public VoteRequest.VoteType getUpdatedVoteType() {
        return updatedVoteType;
    }

    /**
     * Vote Type
     * 
     */
    @JsonProperty("updatedVoteType")
    public void setUpdatedVoteType(VoteRequest.VoteType updatedVoteType) {
        this.updatedVoteType = updatedVoteType;
    }

    public VoteRequest withUpdatedVoteType(VoteRequest.VoteType updatedVoteType) {
        this.updatedVoteType = updatedVoteType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VoteRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("updatedVoteType");
        sb.append('=');
        sb.append(((this.updatedVoteType == null)?"<null>":this.updatedVoteType));
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
        result = ((result* 31)+((this.updatedVoteType == null)? 0 :this.updatedVoteType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VoteRequest) == false) {
            return false;
        }
        VoteRequest rhs = ((VoteRequest) other);
        return ((this.updatedVoteType == rhs.updatedVoteType)||((this.updatedVoteType!= null)&&this.updatedVoteType.equals(rhs.updatedVoteType)));
    }


    /**
     * Vote Type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum VoteType {

        VOTED_UP("votedUp"),
        VOTED_DOWN("votedDown"),
        UN_VOTED("unVoted");
        private final String value;
        private final static Map<String, VoteRequest.VoteType> CONSTANTS = new HashMap<String, VoteRequest.VoteType>();

        static {
            for (VoteRequest.VoteType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        VoteType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static VoteRequest.VoteType fromValue(String value) {
            VoteRequest.VoteType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
