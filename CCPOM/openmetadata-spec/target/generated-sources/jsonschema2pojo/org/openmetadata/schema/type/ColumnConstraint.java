
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This enum defines the type for column constraint.
 * 
 */
@Generated("jsonschema2pojo")
public enum ColumnConstraint {

    NULL("NULL"),
    NOT_NULL("NOT_NULL"),
    UNIQUE("UNIQUE"),
    PRIMARY_KEY("PRIMARY_KEY");
    private final String value;
    private final static Map<String, ColumnConstraint> CONSTANTS = new HashMap<String, ColumnConstraint>();

    static {
        for (ColumnConstraint c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ColumnConstraint(String value) {
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
    public static ColumnConstraint fromValue(String value) {
        ColumnConstraint constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
