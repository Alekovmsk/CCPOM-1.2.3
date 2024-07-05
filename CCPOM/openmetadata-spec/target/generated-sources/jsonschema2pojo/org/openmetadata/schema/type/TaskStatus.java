
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Status of a task.
 * 
 */
@Generated("jsonschema2pojo")
public enum TaskStatus {

    Open("Open"),
    Closed("Closed");
    private final String value;
    private final static Map<String, TaskStatus> CONSTANTS = new HashMap<String, TaskStatus>();

    static {
        for (TaskStatus c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TaskStatus(String value) {
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
    public static TaskStatus fromValue(String value) {
        TaskStatus constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
