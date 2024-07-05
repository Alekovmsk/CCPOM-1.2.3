
package org.openmetadata.schema.auth;

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
 * SSOAuthMechanism
 * <p>
 * User/Bot SSOAuthN.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ssoServiceType",
    "authConfig"
})
@Generated("jsonschema2pojo")
public class SSOAuthMechanism {

    /**
     * Type of database service such as Amundsen, Atlas...
     * 
     */
    @JsonProperty("ssoServiceType")
    @JsonPropertyDescription("Type of database service such as Amundsen, Atlas...")
    private SSOAuthMechanism.SsoServiceType ssoServiceType;
    /**
     * The authentication configuration used by the SSO
     * 
     */
    @JsonProperty("authConfig")
    @JsonPropertyDescription("The authentication configuration used by the SSO")
    private Object authConfig;

    /**
     * Type of database service such as Amundsen, Atlas...
     * 
     */
    @JsonProperty("ssoServiceType")
    public SSOAuthMechanism.SsoServiceType getSsoServiceType() {
        return ssoServiceType;
    }

    /**
     * Type of database service such as Amundsen, Atlas...
     * 
     */
    @JsonProperty("ssoServiceType")
    public void setSsoServiceType(SSOAuthMechanism.SsoServiceType ssoServiceType) {
        this.ssoServiceType = ssoServiceType;
    }

    public SSOAuthMechanism withSsoServiceType(SSOAuthMechanism.SsoServiceType ssoServiceType) {
        this.ssoServiceType = ssoServiceType;
        return this;
    }

    /**
     * The authentication configuration used by the SSO
     * 
     */
    @JsonProperty("authConfig")
    public Object getAuthConfig() {
        return authConfig;
    }

    /**
     * The authentication configuration used by the SSO
     * 
     */
    @JsonProperty("authConfig")
    public void setAuthConfig(Object authConfig) {
        this.authConfig = authConfig;
    }

    public SSOAuthMechanism withAuthConfig(Object authConfig) {
        this.authConfig = authConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SSOAuthMechanism.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssoServiceType");
        sb.append('=');
        sb.append(((this.ssoServiceType == null)?"<null>":this.ssoServiceType));
        sb.append(',');
        sb.append("authConfig");
        sb.append('=');
        sb.append(((this.authConfig == null)?"<null>":this.authConfig));
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
        result = ((result* 31)+((this.ssoServiceType == null)? 0 :this.ssoServiceType.hashCode()));
        result = ((result* 31)+((this.authConfig == null)? 0 :this.authConfig.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SSOAuthMechanism) == false) {
            return false;
        }
        SSOAuthMechanism rhs = ((SSOAuthMechanism) other);
        return (((this.ssoServiceType == rhs.ssoServiceType)||((this.ssoServiceType!= null)&&this.ssoServiceType.equals(rhs.ssoServiceType)))&&((this.authConfig == rhs.authConfig)||((this.authConfig!= null)&&this.authConfig.equals(rhs.authConfig))));
    }


    /**
     * Type of database service such as Amundsen, Atlas...
     * 
     */
    @Generated("jsonschema2pojo")
    public enum SsoServiceType {

        GOOGLE("google"),
        OKTA("okta"),
        AUTH_0("auth0"),
        CUSTOM_OIDC("custom-oidc"),
        AZURE("azure");
        private final String value;
        private final static Map<String, SSOAuthMechanism.SsoServiceType> CONSTANTS = new HashMap<String, SSOAuthMechanism.SsoServiceType>();

        static {
            for (SSOAuthMechanism.SsoServiceType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SsoServiceType(String value) {
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
        public static SSOAuthMechanism.SsoServiceType fromValue(String value) {
            SSOAuthMechanism.SsoServiceType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
