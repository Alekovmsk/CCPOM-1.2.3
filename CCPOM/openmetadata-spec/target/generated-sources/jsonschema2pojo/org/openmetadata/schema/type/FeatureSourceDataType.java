
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This enum defines the type of data of a ML Feature source.
 * 
 */
@Generated("jsonschema2pojo")
public enum FeatureSourceDataType {

    INTEGER("integer"),
    NUMBER("number"),
    STRING("string"),
    ARRAY("array"),
    DATE("date"),
    TIMESTAMP("timestamp"),
    OBJECT("object"),
    BOOLEAN("boolean");
    private final String value;
    private final static Map<String, FeatureSourceDataType> CONSTANTS = new HashMap<String, FeatureSourceDataType>();

    static {
        for (FeatureSourceDataType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    FeatureSourceDataType(String value) {
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
    public static FeatureSourceDataType fromValue(String value) {
        FeatureSourceDataType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
