
package org.openmetadata.schema.tests.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Status of Test Case run.
 * 
 */
@Generated("jsonschema2pojo")
public enum TestCaseStatus {

    Success("Success"),
    Failed("Failed"),
    Aborted("Aborted");
    private final String value;
    private final static Map<String, TestCaseStatus> CONSTANTS = new HashMap<String, TestCaseStatus>();

    static {
        for (TestCaseStatus c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TestCaseStatus(String value) {
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
    public static TestCaseStatus fromValue(String value) {
        TestCaseStatus constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
