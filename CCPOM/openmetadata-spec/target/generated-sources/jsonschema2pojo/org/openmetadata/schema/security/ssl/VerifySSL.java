
package org.openmetadata.schema.security.ssl;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Verify SSL
 * <p>
 * Client SSL verification. Make sure to configure the SSLConfig if enabled.
 * 
 */
@Generated("jsonschema2pojo")
public enum VerifySSL {

    NO_SSL("no-ssl"),
    IGNORE("ignore"),
    VALIDATE("validate");
    private final String value;
    private final static Map<String, VerifySSL> CONSTANTS = new HashMap<String, VerifySSL>();

    static {
        for (VerifySSL c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    VerifySSL(String value) {
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
    public static VerifySSL fromValue(String value) {
        VerifySSL constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
