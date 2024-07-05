
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines the type of DML operation.
 * 
 */
@Generated("jsonschema2pojo")
public enum DmlOperationType {

    UPDATE("UPDATE"),
    INSERT("INSERT"),
    DELETE("DELETE");
    private final String value;
    private final static Map<String, DmlOperationType> CONSTANTS = new HashMap<String, DmlOperationType>();

    static {
        for (DmlOperationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DmlOperationType(String value) {
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
    public static DmlOperationType fromValue(String value) {
        DmlOperationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
