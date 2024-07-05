
package org.openmetadata.schema.dataInsight.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This enum defines the type of key Result
 * 
 */
@Generated("jsonschema2pojo")
public enum KpiTargetType {

    NUMBER("NUMBER"),
    PERCENTAGE("PERCENTAGE");
    private final String value;
    private final static Map<String, KpiTargetType> CONSTANTS = new HashMap<String, KpiTargetType>();

    static {
        for (KpiTargetType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    KpiTargetType(String value) {
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
    public static KpiTargetType fromValue(String value) {
        KpiTargetType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
