
package org.openmetadata.schema.monitoring;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Event Monitor Provider
 * <p>
 * OpenMetadata Event Monitor Provider.
 * 
 */
@Generated("jsonschema2pojo")
public enum EventMonitorProvider {

    CLOUDWATCH("cloudwatch"),
    PROMETHEUS("prometheus");
    private final String value;
    private final static Map<String, EventMonitorProvider> CONSTANTS = new HashMap<String, EventMonitorProvider>();

    static {
        for (EventMonitorProvider c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    EventMonitorProvider(String value) {
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
    public static EventMonitorProvider fromValue(String value) {
        EventMonitorProvider constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
