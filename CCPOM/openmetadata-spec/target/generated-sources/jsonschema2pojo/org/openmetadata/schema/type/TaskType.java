
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Type of a task.
 * 
 */
@Generated("jsonschema2pojo")
public enum TaskType {

    RequestDescription("RequestDescription"),
    UpdateDescription("UpdateDescription"),
    RequestTag("RequestTag"),
    UpdateTag("UpdateTag"),
    RequestApproval("RequestApproval"),
    Generic("Generic");
    private final String value;
    private final static Map<String, TaskType> CONSTANTS = new HashMap<String, TaskType>();

    static {
        for (TaskType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TaskType(String value) {
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
    public static TaskType fromValue(String value) {
        TaskType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
