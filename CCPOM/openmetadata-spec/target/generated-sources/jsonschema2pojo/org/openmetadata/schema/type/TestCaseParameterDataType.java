
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This enum defines the type of data stored in a column.
 * 
 */
@Generated("jsonschema2pojo")
public enum TestCaseParameterDataType {

    NUMBER("NUMBER"),
    INT("INT"),
    FLOAT("FLOAT"),
    DOUBLE("DOUBLE"),
    DECIMAL("DECIMAL"),
    TIMESTAMP("TIMESTAMP"),
    TIME("TIME"),
    DATE("DATE"),
    DATETIME("DATETIME"),
    ARRAY("ARRAY"),
    MAP("MAP"),
    SET("SET"),
    STRING("STRING"),
    BOOLEAN("BOOLEAN");
    private final String value;
    private final static Map<String, TestCaseParameterDataType> CONSTANTS = new HashMap<String, TestCaseParameterDataType>();

    static {
        for (TestCaseParameterDataType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TestCaseParameterDataType(String value) {
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
    public static TestCaseParameterDataType fromValue(String value) {
        TestCaseParameterDataType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
