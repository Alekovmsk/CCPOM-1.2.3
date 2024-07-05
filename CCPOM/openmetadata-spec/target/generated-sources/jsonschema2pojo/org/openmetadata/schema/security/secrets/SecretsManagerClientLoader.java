
package org.openmetadata.schema.security.secrets;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Secrets Manager Client Loader
 * <p>
 * OpenMetadata Secrets Manager Client Loader. Lets the client know how the Secrets Manager Credentials should be loaded from the environment.
 * 
 */
@Generated("jsonschema2pojo")
public enum SecretsManagerClientLoader {

    NOOP("noop"),
    AIRFLOW("airflow"),
    ENV("env");
    private final String value;
    private final static Map<String, SecretsManagerClientLoader> CONSTANTS = new HashMap<String, SecretsManagerClientLoader>();

    static {
        for (SecretsManagerClientLoader c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SecretsManagerClientLoader(String value) {
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
    public static SecretsManagerClientLoader fromValue(String value) {
        SecretsManagerClientLoader constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
