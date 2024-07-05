
package org.openmetadata.schema.entity.utils;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.annotations.PasswordField;
import org.openmetadata.schema.security.ssl.VerifySSL;


/**
 * SupersetApiConnection
 * <p>
 * Superset API Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "provider",
    "username",
    "password",
    "verifySSL",
    "sslConfig"
})
@Generated("jsonschema2pojo")
public class SupersetApiConnection {

    /**
     * Provider
     * <p>
     * Authentication provider for the Superset service. For basic user/password authentication, the default value `db` can be used. This parameter is used internally to connect to Superset's REST API.
     * (Required)
     * 
     */
    @JsonProperty("provider")
    @JsonPropertyDescription("Authentication provider for the Superset service. For basic user/password authentication, the default value `db` can be used. This parameter is used internally to connect to Superset's REST API.")
    @NotNull
    private SupersetApiConnection.ApiProvider provider = SupersetApiConnection.ApiProvider.fromValue("db");
    /**
     * Username
     * <p>
     * Username for Superset.
     * (Required)
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("Username for Superset.")
    @NotNull
    private String username;
    /**
     * Password
     * <p>
     * Password for Superset.
     * (Required)
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("Password for Superset.")
    @PasswordField
    @NotNull
    private String password;
    /**
     * Verify SSL
     * <p>
     * Client SSL verification. Make sure to configure the SSLConfig if enabled.
     * 
     */
    @JsonProperty("verifySSL")
    @JsonPropertyDescription("Client SSL verification. Make sure to configure the SSLConfig if enabled.")
    private VerifySSL verifySSL = VerifySSL.fromValue("no-ssl");
    /**
     * SSL Config
     * <p>
     * Client SSL configuration
     * 
     */
    @JsonProperty("sslConfig")
    @JsonPropertyDescription("Client SSL configuration")
    private Object sslConfig;

    /**
     * Provider
     * <p>
     * Authentication provider for the Superset service. For basic user/password authentication, the default value `db` can be used. This parameter is used internally to connect to Superset's REST API.
     * (Required)
     * 
     */
    @JsonProperty("provider")
    public SupersetApiConnection.ApiProvider getProvider() {
        return provider;
    }

    /**
     * Provider
     * <p>
     * Authentication provider for the Superset service. For basic user/password authentication, the default value `db` can be used. This parameter is used internally to connect to Superset's REST API.
     * (Required)
     * 
     */
    @JsonProperty("provider")
    public void setProvider(SupersetApiConnection.ApiProvider provider) {
        this.provider = provider;
    }

    public SupersetApiConnection withProvider(SupersetApiConnection.ApiProvider provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Username
     * <p>
     * Username for Superset.
     * (Required)
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Username
     * <p>
     * Username for Superset.
     * (Required)
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public SupersetApiConnection withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Password
     * <p>
     * Password for Superset.
     * (Required)
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public String getPassword() {
        return password;
    }

    /**
     * Password
     * <p>
     * Password for Superset.
     * (Required)
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public void setPassword(String password) {
        this.password = password;
    }

    public SupersetApiConnection withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Verify SSL
     * <p>
     * Client SSL verification. Make sure to configure the SSLConfig if enabled.
     * 
     */
    @JsonProperty("verifySSL")
    public VerifySSL getVerifySSL() {
        return verifySSL;
    }

    /**
     * Verify SSL
     * <p>
     * Client SSL verification. Make sure to configure the SSLConfig if enabled.
     * 
     */
    @JsonProperty("verifySSL")
    public void setVerifySSL(VerifySSL verifySSL) {
        this.verifySSL = verifySSL;
    }

    public SupersetApiConnection withVerifySSL(VerifySSL verifySSL) {
        this.verifySSL = verifySSL;
        return this;
    }

    /**
     * SSL Config
     * <p>
     * Client SSL configuration
     * 
     */
    @JsonProperty("sslConfig")
    public Object getSslConfig() {
        return sslConfig;
    }

    /**
     * SSL Config
     * <p>
     * Client SSL configuration
     * 
     */
    @JsonProperty("sslConfig")
    public void setSslConfig(Object sslConfig) {
        this.sslConfig = sslConfig;
    }

    public SupersetApiConnection withSslConfig(Object sslConfig) {
        this.sslConfig = sslConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SupersetApiConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("provider");
        sb.append('=');
        sb.append(((this.provider == null)?"<null>":this.provider));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("password");
        sb.append('=');
        sb.append(((this.password == null)?"<null>":this.password));
        sb.append(',');
        sb.append("verifySSL");
        sb.append('=');
        sb.append(((this.verifySSL == null)?"<null>":this.verifySSL));
        sb.append(',');
        sb.append("sslConfig");
        sb.append('=');
        sb.append(((this.sslConfig == null)?"<null>":this.sslConfig));
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
        result = ((result* 31)+((this.verifySSL == null)? 0 :this.verifySSL.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.sslConfig == null)? 0 :this.sslConfig.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SupersetApiConnection) == false) {
            return false;
        }
        SupersetApiConnection rhs = ((SupersetApiConnection) other);
        return ((((((this.verifySSL == rhs.verifySSL)||((this.verifySSL!= null)&&this.verifySSL.equals(rhs.verifySSL)))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.sslConfig == rhs.sslConfig)||((this.sslConfig!= null)&&this.sslConfig.equals(rhs.sslConfig))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }


    /**
     * Provider
     * <p>
     * Authentication provider for the Superset service. For basic user/password authentication, the default value `db` can be used. This parameter is used internally to connect to Superset's REST API.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ApiProvider {

        DB("db"),
        LDAP("ldap");
        private final String value;
        private final static Map<String, SupersetApiConnection.ApiProvider> CONSTANTS = new HashMap<String, SupersetApiConnection.ApiProvider>();

        static {
            for (SupersetApiConnection.ApiProvider c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ApiProvider(String value) {
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
        public static SupersetApiConnection.ApiProvider fromValue(String value) {
            SupersetApiConnection.ApiProvider constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
