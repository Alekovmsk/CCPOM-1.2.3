
package org.openmetadata.schema.api.security;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Response Type
 * 
 */
@Generated("jsonschema2pojo")
public enum ResponseType {

    ID_TOKEN("id_token"),
    CODE("code");
    private final String value;
    private final static Map<String, ResponseType> CONSTANTS = new HashMap<String, ResponseType>();

    static {
        for (ResponseType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ResponseType(String value) {
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
    public static ResponseType fromValue(String value) {
        ResponseType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
