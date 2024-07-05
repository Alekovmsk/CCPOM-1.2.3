
package org.openmetadata.schema.tests.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Status of Test Case Acknowledgement.
 * 
 */
@Generated("jsonschema2pojo")
public enum TestCaseFailureStatusType {

    Ack("Ack"),
    New("New"),
    Resolved("Resolved");
    private final String value;
    private final static Map<String, TestCaseFailureStatusType> CONSTANTS = new HashMap<String, TestCaseFailureStatusType>();

    static {
        for (TestCaseFailureStatusType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TestCaseFailureStatusType(String value) {
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
    public static TestCaseFailureStatusType fromValue(String value) {
        TestCaseFailureStatusType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
