
package org.openmetadata.schema.entity.automations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This enum defines the type for which this workflow applies to.
 * 
 */
@Generated("jsonschema2pojo")
public enum WorkflowType {

    TEST_CONNECTION("TEST_CONNECTION");
    private final String value;
    private final static Map<String, WorkflowType> CONSTANTS = new HashMap<String, WorkflowType>();

    static {
        for (WorkflowType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    WorkflowType(String value) {
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
    public static WorkflowType fromValue(String value) {
        WorkflowType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
