
package org.openmetadata.schema.security.client;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.PasswordField;


/**
 * openMetadataJWTClientConfig
 * <p>
 * openMetadataJWTClientConfig security configs.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "jwtToken"
})
@Generated("jsonschema2pojo")
public class OpenMetadataJWTClientConfig {

    /**
     * OpenMetadata generated JWT token.
     * (Required)
     * 
     */
    @JsonProperty("jwtToken")
    @JsonPropertyDescription("OpenMetadata generated JWT token.")
    @PasswordField
    @NotNull
    private String jwtToken;

    /**
     * OpenMetadata generated JWT token.
     * (Required)
     * 
     */
    @JsonProperty("jwtToken")
    @PasswordField
    public String getJwtToken() {
        return jwtToken;
    }

    /**
     * OpenMetadata generated JWT token.
     * (Required)
     * 
     */
    @JsonProperty("jwtToken")
    @PasswordField
    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public OpenMetadataJWTClientConfig withJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpenMetadataJWTClientConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("jwtToken");
        sb.append('=');
        sb.append(((this.jwtToken == null)?"<null>":this.jwtToken));
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
        result = ((result* 31)+((this.jwtToken == null)? 0 :this.jwtToken.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpenMetadataJWTClientConfig) == false) {
            return false;
        }
        OpenMetadataJWTClientConfig rhs = ((OpenMetadataJWTClientConfig) other);
        return ((this.jwtToken == rhs.jwtToken)||((this.jwtToken!= null)&&this.jwtToken.equals(rhs.jwtToken)));
    }

}
