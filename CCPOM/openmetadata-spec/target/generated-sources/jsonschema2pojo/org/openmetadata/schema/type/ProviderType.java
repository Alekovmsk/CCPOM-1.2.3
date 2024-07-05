
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.
 * 
 */
@Generated("jsonschema2pojo")
public enum ProviderType {

    SYSTEM("system"),
    USER("user");
    private final String value;
    private final static Map<String, ProviderType> CONSTANTS = new HashMap<String, ProviderType>();

    static {
        for (ProviderType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ProviderType(String value) {
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
    public static ProviderType fromValue(String value) {
        ProviderType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
