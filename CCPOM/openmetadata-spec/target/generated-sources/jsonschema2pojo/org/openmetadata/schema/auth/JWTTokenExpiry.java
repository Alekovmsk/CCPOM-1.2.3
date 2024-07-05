
package org.openmetadata.schema.auth;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * JWT Auth Token expiration in days
 * 
 */
@Generated("jsonschema2pojo")
public enum JWTTokenExpiry {

    OneHour("OneHour"),
    One("1"),
    Seven("7"),
    Thirty("30"),
    Sixty("60"),
    Ninety("90"),
    Unlimited("Unlimited");
    private final String value;
    private final static Map<String, JWTTokenExpiry> CONSTANTS = new HashMap<String, JWTTokenExpiry>();

    static {
        for (JWTTokenExpiry c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    JWTTokenExpiry(String value) {
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
    public static JWTTokenExpiry fromValue(String value) {
        JWTTokenExpiry constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
