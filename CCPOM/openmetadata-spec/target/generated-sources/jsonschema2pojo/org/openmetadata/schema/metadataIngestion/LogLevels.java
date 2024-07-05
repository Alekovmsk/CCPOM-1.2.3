
package org.openmetadata.schema.metadataIngestion;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Supported logging levels
 * 
 */
@Generated("jsonschema2pojo")
public enum LogLevels {

    DEBUG("DEBUG"),
    INFO("INFO"),
    WARN("WARN"),
    ERROR("ERROR");
    private final String value;
    private final static Map<String, LogLevels> CONSTANTS = new HashMap<String, LogLevels>();

    static {
        for (LogLevels c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    LogLevels(String value) {
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
    public static LogLevels fromValue(String value) {
        LogLevels constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
