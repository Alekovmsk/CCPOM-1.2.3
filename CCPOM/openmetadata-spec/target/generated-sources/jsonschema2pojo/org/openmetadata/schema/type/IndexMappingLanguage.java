
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines the language options available for search index mappings.
 * 
 */
@Generated("jsonschema2pojo")
public enum IndexMappingLanguage {

    EN("EN"),
    JP("JP"),
    ZH("ZH");
    private final String value;
    private final static Map<String, IndexMappingLanguage> CONSTANTS = new HashMap<String, IndexMappingLanguage>();

    static {
        for (IndexMappingLanguage c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    IndexMappingLanguage(String value) {
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
    public static IndexMappingLanguage fromValue(String value) {
        IndexMappingLanguage constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
