
package org.openmetadata.schema.entity.services;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Service Type
 * <p>
 * This schema defines the service types entities which requires a connection.
 * 
 */
@Generated("jsonschema2pojo")
public enum ServiceType {

    DASHBOARD("Dashboard"),
    DATABASE("Database"),
    MESSAGING("Messaging"),
    METADATA("Metadata"),
    ML_MODEL("MlModel"),
    PIPELINE("Pipeline"),
    STORAGE("Storage"),
    SEARCH("Search");
    private final String value;
    private final static Map<String, ServiceType> CONSTANTS = new HashMap<String, ServiceType>();

    static {
        for (ServiceType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ServiceType(String value) {
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
    public static ServiceType fromValue(String value) {
        ServiceType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
