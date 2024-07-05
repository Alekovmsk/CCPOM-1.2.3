
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines the type used for describing different types of dashboards.
 * 
 */
@Generated("jsonschema2pojo")
public enum DashboardType {

    Dashboard("Dashboard"),
    Report("Report");
    private final String value;
    private final static Map<String, DashboardType> CONSTANTS = new HashMap<String, DashboardType>();

    static {
        for (DashboardType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DashboardType(String value) {
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
    public static DashboardType fromValue(String value) {
        DashboardType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
