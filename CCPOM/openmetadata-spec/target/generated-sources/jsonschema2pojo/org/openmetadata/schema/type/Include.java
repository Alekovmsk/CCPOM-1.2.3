
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Include
 * <p>
 * GET entity by id, GET entity by name, and LIST entities can include deleted or non-deleted entities using the parameter include.
 * 
 */
@Generated("jsonschema2pojo")
public enum Include {

    ALL("all"),
    DELETED("deleted"),
    NON_DELETED("non-deleted");
    private final String value;
    private final static Map<String, Include> CONSTANTS = new HashMap<String, Include>();

    static {
        for (Include c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    Include(String value) {
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
    public static Include fromValue(String value) {
        Include constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
