
package org.openmetadata.schema.type.topic;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Topic clean up policy. For Kafka - `cleanup.policy` configuration.
 * 
 */
@Generated("jsonschema2pojo")
public enum CleanupPolicy {

    DELETE("delete"),
    COMPACT("compact");
    private final String value;
    private final static Map<String, CleanupPolicy> CONSTANTS = new HashMap<String, CleanupPolicy>();

    static {
        for (CleanupPolicy c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CleanupPolicy(String value) {
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
    public static CleanupPolicy fromValue(String value) {
        CleanupPolicy constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
