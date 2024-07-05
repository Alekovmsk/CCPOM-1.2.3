
package org.openmetadata.schema.entity.services.connections;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Enum defining possible Test Connection Result status
 * 
 */
@Generated("jsonschema2pojo")
public enum TestConnectionResultStatus {

    SUCCESSFUL("Successful"),
    FAILED("Failed"),
    RUNNING("Running");
    private final String value;
    private final static Map<String, TestConnectionResultStatus> CONSTANTS = new HashMap<String, TestConnectionResultStatus>();

    static {
        for (TestConnectionResultStatus c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TestConnectionResultStatus(String value) {
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
    public static TestConnectionResultStatus fromValue(String value) {
        TestConnectionResultStatus constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
