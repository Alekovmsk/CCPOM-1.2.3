
package org.openmetadata.schema.entity.teams;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * User/Bot Authentication Mechanism.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "config",
    "authType"
})
@Generated("jsonschema2pojo")
public class AuthenticationMechanism {

    @JsonProperty("config")
    private Object config;
    @JsonProperty("authType")
    private AuthenticationMechanism.AuthType authType;

    @JsonProperty("config")
    public Object getConfig() {
        return config;
    }

    @JsonProperty("config")
    public void setConfig(Object config) {
        this.config = config;
    }

    public AuthenticationMechanism withConfig(Object config) {
        this.config = config;
        return this;
    }

    @JsonProperty("authType")
    public AuthenticationMechanism.AuthType getAuthType() {
        return authType;
    }

    @JsonProperty("authType")
    public void setAuthType(AuthenticationMechanism.AuthType authType) {
        this.authType = authType;
    }

    public AuthenticationMechanism withAuthType(AuthenticationMechanism.AuthType authType) {
        this.authType = authType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AuthenticationMechanism.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("config");
        sb.append('=');
        sb.append(((this.config == null)?"<null>":this.config));
        sb.append(',');
        sb.append("authType");
        sb.append('=');
        sb.append(((this.authType == null)?"<null>":this.authType));
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
        result = ((result* 31)+((this.authType == null)? 0 :this.authType.hashCode()));
        result = ((result* 31)+((this.config == null)? 0 :this.config.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuthenticationMechanism) == false) {
            return false;
        }
        AuthenticationMechanism rhs = ((AuthenticationMechanism) other);
        return (((this.authType == rhs.authType)||((this.authType!= null)&&this.authType.equals(rhs.authType)))&&((this.config == rhs.config)||((this.config!= null)&&this.config.equals(rhs.config))));
    }

    @Generated("jsonschema2pojo")
    public enum AuthType {

        JWT("JWT"),
        SSO("SSO"),
        BASIC("BASIC");
        private final String value;
        private final static Map<String, AuthenticationMechanism.AuthType> CONSTANTS = new HashMap<String, AuthenticationMechanism.AuthType>();

        static {
            for (AuthenticationMechanism.AuthType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AuthType(String value) {
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
        public static AuthenticationMechanism.AuthType fromValue(String value) {
            AuthenticationMechanism.AuthType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
