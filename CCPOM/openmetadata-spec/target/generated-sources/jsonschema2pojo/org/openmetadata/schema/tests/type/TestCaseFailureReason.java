
package org.openmetadata.schema.tests.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Reason of Test Case resolution.
 * 
 */
@Generated("jsonschema2pojo")
public enum TestCaseFailureReason {

    FalsePositive("FalsePositive"),
    MissingData("MissingData"),
    Duplicates("Duplicates"),
    OutOfBounds("OutOfBounds"),
    Other("Other");
    private final String value;
    private final static Map<String, TestCaseFailureReason> CONSTANTS = new HashMap<String, TestCaseFailureReason>();

    static {
        for (TestCaseFailureReason c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TestCaseFailureReason(String value) {
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
    public static TestCaseFailureReason fromValue(String value) {
        TestCaseFailureReason constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
