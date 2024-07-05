
package org.openmetadata.schema.entity.app;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines the Permission used by Native Application.
 * 
 */
@Generated("jsonschema2pojo")
public enum NativeAppPermission {

    All("All");
    private final String value;
    private final static Map<String, NativeAppPermission> CONSTANTS = new HashMap<String, NativeAppPermission>();

    static {
        for (NativeAppPermission c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    NativeAppPermission(String value) {
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
    public static NativeAppPermission fromValue(String value) {
        NativeAppPermission constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
