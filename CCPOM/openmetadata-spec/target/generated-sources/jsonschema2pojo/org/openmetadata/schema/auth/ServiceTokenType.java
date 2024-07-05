
package org.openmetadata.schema.auth;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * ServiceTokenType
 * <p>
 * Different Type of OpenMetadata Service tokens
 * 
 */
@Generated("jsonschema2pojo")
public enum ServiceTokenType {

    BOT("BOT"),
    OM_USER("OM_USER"),
    PERSONAL_ACCESS("PERSONAL_ACCESS");
    private final String value;
    private final static Map<String, ServiceTokenType> CONSTANTS = new HashMap<String, ServiceTokenType>();

    static {
        for (ServiceTokenType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ServiceTokenType(String value) {
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
    public static ServiceTokenType fromValue(String value) {
        ServiceTokenType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
