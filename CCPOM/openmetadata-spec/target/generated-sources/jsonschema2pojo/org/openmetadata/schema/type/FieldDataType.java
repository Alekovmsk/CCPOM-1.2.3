
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This enum defines the type of data defined in schema.
 * 
 */
@Generated("jsonschema2pojo")
public enum FieldDataType {

    RECORD("RECORD"),
    NULL("NULL"),
    BOOLEAN("BOOLEAN"),
    INT("INT"),
    LONG("LONG"),
    BYTES("BYTES"),
    FLOAT("FLOAT"),
    DOUBLE("DOUBLE"),
    TIMESTAMP("TIMESTAMP"),
    TIMESTAMPZ("TIMESTAMPZ"),
    TIME("TIME"),
    DATE("DATE"),
    STRING("STRING"),
    ARRAY("ARRAY"),
    MAP("MAP"),
    ENUM("ENUM"),
    UNION("UNION"),
    FIXED("FIXED"),
    ERROR("ERROR"),
    UNKNOWN("UNKNOWN");
    private final String value;
    private final static Map<String, FieldDataType> CONSTANTS = new HashMap<String, FieldDataType>();

    static {
        for (FieldDataType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    FieldDataType(String value) {
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
    public static FieldDataType fromValue(String value) {
        FieldDataType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
