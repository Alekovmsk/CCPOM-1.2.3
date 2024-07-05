
package org.openmetadata.schema.entity.app;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines the type of application Run.
 * 
 */
@Generated("jsonschema2pojo")
public enum AppRunType {

    Scheduled("Scheduled"),
    OnDemand("OnDemand");
    private final String value;
    private final static Map<String, AppRunType> CONSTANTS = new HashMap<String, AppRunType>();

    static {
        for (AppRunType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AppRunType(String value) {
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
    public static AppRunType fromValue(String value) {
        AppRunType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
