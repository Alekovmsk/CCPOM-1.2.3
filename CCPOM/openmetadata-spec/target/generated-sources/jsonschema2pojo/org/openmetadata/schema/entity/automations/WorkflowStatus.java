
package org.openmetadata.schema.entity.automations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Enum defining possible Workflow status
 * 
 */
@Generated("jsonschema2pojo")
public enum WorkflowStatus {

    PENDING("Pending"),
    SUCCESSFUL("Successful"),
    FAILED("Failed"),
    RUNNING("Running");
    private final String value;
    private final static Map<String, WorkflowStatus> CONSTANTS = new HashMap<String, WorkflowStatus>();

    static {
        for (WorkflowStatus c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    WorkflowStatus(String value) {
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
    public static WorkflowStatus fromValue(String value) {
        WorkflowStatus constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
