
package org.openmetadata.schema.entity.app;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines the type of application.
 * 
 */
@Generated("jsonschema2pojo")
public enum ScheduleType {

    Live("Live"),
    Scheduled("Scheduled");
    private final String value;
    private final static Map<String, ScheduleType> CONSTANTS = new HashMap<String, ScheduleType>();

    static {
        for (ScheduleType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ScheduleType(String value) {
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
    public static ScheduleType fromValue(String value) {
        ScheduleType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
