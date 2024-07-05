
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Type of event.
 * 
 */
@Generated("jsonschema2pojo")
public enum EventType {

    ENTITY_CREATED("entityCreated"),
    ENTITY_UPDATED("entityUpdated"),
    ENTITY_NO_CHANGE("entityNoChange"),
    ENTITY_SOFT_DELETED("entitySoftDeleted"),
    ENTITY_DELETED("entityDeleted"),
    ENTITY_RESTORED("entityRestored");
    private final String value;
    private final static Map<String, EventType> CONSTANTS = new HashMap<String, EventType>();

    static {
        for (EventType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    EventType(String value) {
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
    public static EventType fromValue(String value) {
        EventType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
