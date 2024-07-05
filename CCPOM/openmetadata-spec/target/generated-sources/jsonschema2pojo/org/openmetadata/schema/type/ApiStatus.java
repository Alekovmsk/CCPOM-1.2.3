
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * State of an action over API.
 * 
 */
@Generated("jsonschema2pojo")
public enum ApiStatus {

    SUCCESS("success"),
    FAILURE("failure"),
    ABORTED("aborted"),
    PARTIAL_SUCCESS("partialSuccess");
    private final String value;
    private final static Map<String, ApiStatus> CONSTANTS = new HashMap<String, ApiStatus>();

    static {
        for (ApiStatus c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ApiStatus(String value) {
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
    public static ApiStatus fromValue(String value) {
        ApiStatus constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
