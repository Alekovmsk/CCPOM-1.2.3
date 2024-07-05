
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This enum defines the type for which this test definition applies to.
 * 
 */
@Generated("jsonschema2pojo")
public enum TestDefinitionEntityType {

    TABLE("TABLE"),
    COLUMN("COLUMN");
    private final String value;
    private final static Map<String, TestDefinitionEntityType> CONSTANTS = new HashMap<String, TestDefinitionEntityType>();

    static {
        for (TestDefinitionEntityType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TestDefinitionEntityType(String value) {
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
    public static TestDefinitionEntityType fromValue(String value) {
        TestDefinitionEntityType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
