
package org.openmetadata.schema.services.connections.messaging;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * SaslMechanismType
 * <p>
 * SASL Mechanism consumer config property
 * 
 */
@Generated("jsonschema2pojo")
public enum SaslMechanismType {

    PLAIN("PLAIN"),
    GSSAPI("GSSAPI"),
    SCRAM_SHA_256("SCRAM-SHA-256"),
    SCRAM_SHA_512("SCRAM-SHA-512"),
    OAUTHBEARER("OAUTHBEARER");
    private final String value;
    private final static Map<String, SaslMechanismType> CONSTANTS = new HashMap<String, SaslMechanismType>();

    static {
        for (SaslMechanismType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SaslMechanismType(String value) {
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
    public static SaslMechanismType fromValue(String value) {
        SaslMechanismType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
