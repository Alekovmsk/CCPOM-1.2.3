
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines the type of the language used for Stored Procedure's Code.
 * 
 */
@Generated("jsonschema2pojo")
public enum StoredProcedureLanguage {

    SQL("SQL"),
    Java("Java"),
    JavaScript("JavaScript"),
    Python("Python");
    private final String value;
    private final static Map<String, StoredProcedureLanguage> CONSTANTS = new HashMap<String, StoredProcedureLanguage>();

    static {
        for (StoredProcedureLanguage c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    StoredProcedureLanguage(String value) {
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
    public static StoredProcedureLanguage fromValue(String value) {
        StoredProcedureLanguage constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
