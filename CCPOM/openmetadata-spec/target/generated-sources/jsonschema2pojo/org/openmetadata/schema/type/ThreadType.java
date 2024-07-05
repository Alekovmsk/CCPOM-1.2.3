
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Type of thread.
 * 
 */
@Generated("jsonschema2pojo")
public enum ThreadType {

    Conversation("Conversation"),
    Task("Task"),
    Announcement("Announcement");
    private final String value;
    private final static Map<String, ThreadType> CONSTANTS = new HashMap<String, ThreadType>();

    static {
        for (ThreadType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ThreadType(String value) {
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
    public static ThreadType fromValue(String value) {
        ThreadType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
