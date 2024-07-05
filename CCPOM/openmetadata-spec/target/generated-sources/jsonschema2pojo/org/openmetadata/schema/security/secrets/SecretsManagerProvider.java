
package org.openmetadata.schema.security.secrets;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Secrets Manager Provider
 * <p>
 * OpenMetadata Secrets Manager Provider. Make sure to configure the same secrets manager providers as the ones configured on the OpenMetadata server.
 * 
 */
@Generated("jsonschema2pojo")
public enum SecretsManagerProvider {

    NOOP("noop"),
    MANAGED_AWS("managed-aws"),
    AWS("aws"),
    MANAGED_AWS_SSM("managed-aws-ssm"),
    AWS_SSM("aws-ssm"),
    IN_MEMORY("in-memory");
    private final String value;
    private final static Map<String, SecretsManagerProvider> CONSTANTS = new HashMap<String, SecretsManagerProvider>();

    static {
        for (SecretsManagerProvider c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SecretsManagerProvider(String value) {
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
    public static SecretsManagerProvider fromValue(String value) {
        SecretsManagerProvider constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
