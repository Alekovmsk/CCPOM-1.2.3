
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines the type used for describing different types of tables.
 * 
 */
@Generated("jsonschema2pojo")
public enum TableType {

    Regular("Regular"),
    External("External"),
    View("View"),
    SecureView("SecureView"),
    MaterializedView("MaterializedView"),
    Iceberg("Iceberg"),
    Local("Local"),
    Partitioned("Partitioned"),
    Foreign("Foreign"),
    Transient("Transient");
    private final String value;
    private final static Map<String, TableType> CONSTANTS = new HashMap<String, TableType>();

    static {
        for (TableType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TableType(String value) {
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
    public static TableType fromValue(String value) {
        TableType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
