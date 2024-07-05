
package org.openmetadata.schema.tests;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines the platform where tests are defined and ran.
 * 
 */
@Generated("jsonschema2pojo")
public enum TestPlatform {

    OPEN_METADATA("OpenMetadata"),
    GREAT_EXPECTATIONS("GreatExpectations"),
    DBT("DBT"),
    DEEQU("Deequ"),
    SODA("Soda"),
    OTHER("Other");
    private final String value;
    private final static Map<String, TestPlatform> CONSTANTS = new HashMap<String, TestPlatform>();

    static {
        for (TestPlatform c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TestPlatform(String value) {
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
    public static TestPlatform fromValue(String value) {
        TestPlatform constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
