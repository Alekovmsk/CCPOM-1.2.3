
package org.openmetadata.schema.auth;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RevokePersonalToken
 * <p>
 * Generate JWT Token Request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tokenIds"
})
@Generated("jsonschema2pojo")
public class RevokePersonalTokenRequest {

    /**
     * Ids of Personal Access Tokens to remove.
     * 
     */
    @JsonProperty("tokenIds")
    @JsonPropertyDescription("Ids of Personal Access Tokens to remove.")
    @Valid
    private List<UUID> tokenIds = new ArrayList<UUID>();

    /**
     * Ids of Personal Access Tokens to remove.
     * 
     */
    @JsonProperty("tokenIds")
    public List<UUID> getTokenIds() {
        return tokenIds;
    }

    /**
     * Ids of Personal Access Tokens to remove.
     * 
     */
    @JsonProperty("tokenIds")
    public void setTokenIds(List<UUID> tokenIds) {
        this.tokenIds = tokenIds;
    }

    public RevokePersonalTokenRequest withTokenIds(List<UUID> tokenIds) {
        this.tokenIds = tokenIds;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RevokePersonalTokenRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tokenIds");
        sb.append('=');
        sb.append(((this.tokenIds == null)?"<null>":this.tokenIds));
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
        result = ((result* 31)+((this.tokenIds == null)? 0 :this.tokenIds.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RevokePersonalTokenRequest) == false) {
            return false;
        }
        RevokePersonalTokenRequest rhs = ((RevokePersonalTokenRequest) other);
        return ((this.tokenIds == rhs.tokenIds)||((this.tokenIds!= null)&&this.tokenIds.equals(rhs.tokenIds)));
    }

}
