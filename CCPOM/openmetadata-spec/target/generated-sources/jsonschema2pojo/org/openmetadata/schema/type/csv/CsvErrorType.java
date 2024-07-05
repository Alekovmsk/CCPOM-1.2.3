
package org.openmetadata.schema.type.csv;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * csvErrorType
 * <p>
 * What type of error occurred when importing a CSV file.
 * 
 */
@Generated("jsonschema2pojo")
public enum CsvErrorType {

    UNKNOWN("UNKNOWN"),
    PARSER_FAILURE("PARSER_FAILURE"),
    INVALID_HEADER("INVALID_HEADER"),
    INVALID_FIELD_COUNT("INVALID_FIELD_COUNT"),
    FIELD_REQUIRED("FIELD_REQUIRED"),
    INVALID_FIELD("INVALID_FIELD");
    private final String value;
    private final static Map<String, CsvErrorType> CONSTANTS = new HashMap<String, CsvErrorType>();

    static {
        for (CsvErrorType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CsvErrorType(String value) {
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
    public static CsvErrorType fromValue(String value) {
        CsvErrorType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
