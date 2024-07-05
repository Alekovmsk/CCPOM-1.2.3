
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This enum defines the type of data stored in a ML Feature.
 * 
 */
@Generated("jsonschema2pojo")
public enum MlFeatureDataType {

    Numerical("numerical"),
    Categorical("categorical");
    private final String value;
    private final static Map<String, MlFeatureDataType> CONSTANTS = new HashMap<String, MlFeatureDataType>();

    static {
        for (MlFeatureDataType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    MlFeatureDataType(String value) {
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
    public static MlFeatureDataType fromValue(String value) {
        MlFeatureDataType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
