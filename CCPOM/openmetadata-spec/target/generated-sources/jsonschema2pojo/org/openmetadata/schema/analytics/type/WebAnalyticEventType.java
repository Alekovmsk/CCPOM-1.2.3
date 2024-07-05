
package org.openmetadata.schema.analytics.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * event type
 * 
 */
@Generated("jsonschema2pojo")
public enum WebAnalyticEventType {

    PAGE_VIEW("PageView"),
    CUSTOM_EVENT("CustomEvent");
    private final String value;
    private final static Map<String, WebAnalyticEventType> CONSTANTS = new HashMap<String, WebAnalyticEventType>();

    static {
        for (WebAnalyticEventType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    WebAnalyticEventType(String value) {
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
    public static WebAnalyticEventType fromValue(String value) {
        WebAnalyticEventType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
