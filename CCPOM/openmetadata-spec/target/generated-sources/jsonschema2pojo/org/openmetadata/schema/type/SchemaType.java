
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Schema type used for the message.
 * 
 */
@Generated("jsonschema2pojo")
public enum SchemaType {

    Avro("Avro"),
    Protobuf("Protobuf"),
    JSON("JSON"),
    Other("Other"),
    None("None");
    private final String value;
    private final static Map<String, SchemaType> CONSTANTS = new HashMap<String, SchemaType>();

    static {
        for (SchemaType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SchemaType(String value) {
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
    public static SchemaType fromValue(String value) {
        SchemaType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
