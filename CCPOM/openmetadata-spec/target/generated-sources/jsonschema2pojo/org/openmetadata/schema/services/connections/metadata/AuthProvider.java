
package org.openmetadata.schema.services.connections.metadata;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * OpenMetadata Server Authentication Provider. Make sure configure same auth providers as the one configured on OpenMetadata server.
 * 
 */
@Generated("jsonschema2pojo")
public enum AuthProvider {

    NO_AUTH("no-auth"),
    BASIC("basic"),
    AZURE("azure"),
    GOOGLE("google"),
    OKTA("okta"),
    AUTH_0("auth0"),
    AWS_COGNITO("aws-cognito"),
    CUSTOM_OIDC("custom-oidc"),
    LDAP("ldap"),
    SAML("saml"),
    OPENMETADATA("openmetadata");
    private final String value;
    private final static Map<String, AuthProvider> CONSTANTS = new HashMap<String, AuthProvider>();

    static {
        for (AuthProvider c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AuthProvider(String value) {
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
    public static AuthProvider fromValue(String value) {
        AuthProvider constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
