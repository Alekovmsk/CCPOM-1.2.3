
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Enum defining the possible Status.
 * 
 */
@Generated("jsonschema2pojo")
public enum StatusType {

    Successful("Successful"),
    Failed("Failed"),
    Pending("Pending");
    private final String value;
    private final static Map<String, StatusType> CONSTANTS = new HashMap<String, StatusType>();

    static {
        for (StatusType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    StatusType(String value) {
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
    public static StatusType fromValue(String value) {
        StatusType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
