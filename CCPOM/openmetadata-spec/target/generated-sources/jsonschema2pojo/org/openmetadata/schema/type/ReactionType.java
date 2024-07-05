
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Type of reaction.
 * 
 */
@Generated("jsonschema2pojo")
public enum ReactionType {

    THUMBS_UP("thumbsUp"),
    THUMBS_DOWN("thumbsDown"),
    HOORAY("hooray"),
    LAUGH("laugh"),
    CONFUSED("confused"),
    HEART("heart"),
    ROCKET("rocket"),
    EYES("eyes");
    private final String value;
    private final static Map<String, ReactionType> CONSTANTS = new HashMap<String, ReactionType>();

    static {
        for (ReactionType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ReactionType(String value) {
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
    public static ReactionType fromValue(String value) {
        ReactionType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
