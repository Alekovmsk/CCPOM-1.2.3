
package org.openmetadata.schema.auth;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Different Type of User token
 * 
 */
@Generated("jsonschema2pojo")
public enum TokenType {

    REFRESH_TOKEN("REFRESH_TOKEN"),
    EMAIL_VERIFICATION("EMAIL_VERIFICATION"),
    PASSWORD_RESET("PASSWORD_RESET"),
    PERSONAL_ACCESS_TOKEN("PERSONAL_ACCESS_TOKEN");
    private final String value;
    private final static Map<String, TokenType> CONSTANTS = new HashMap<String, TokenType>();

    static {
        for (TokenType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TokenType(String value) {
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
    public static TokenType fromValue(String value) {
        TokenType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
